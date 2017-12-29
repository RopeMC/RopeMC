package de.ropemc.mods;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class ModManager
{

	private static List<Mod>	mods	= new ArrayList<Mod>();

	public static void loadModules(File folder)
	{
		mods.clear();
		Map<File, ModDescription> modfiles = new HashMap<File, ModDescription>();
		JsonParser parser = new JsonParser();
		for(File f : folder.listFiles())
		{
			if(!f.isDirectory())
				if(f.getName().endsWith(".jar"))
				{
					String error = null;
					try
					{
						JarInputStream s = new JarInputStream(new FileInputStream(f));
						String data = null;
						while(data == null)
						{
							JarEntry je = s.getNextJarEntry();
							if(je==null)break;
							if(je.getName().equals("modinfo.json"))
							{
								data = "";
								ByteArrayOutputStream os = new ByteArrayOutputStream();
								while(true)
								{
									int qwe = s.read();
									if(qwe == -1)
										break;
									os.write(qwe);
								}
								for(byte b : os.toByteArray())
									data += (char) b;
								s.closeEntry();
								break;
							}
						}
						if(data != null)
						{
							JsonObject root = null;
							try
							{
								JsonElement roote = parser.parse(data);
								root = roote.getAsJsonObject();
							}
							catch(Exception ex)
							{
								
							}
							if(root != null)
							{
								if(root.has("name") && root.has("version") && root.has("main"))
								{
									String name = root.get("name").getAsString();
									String version = root.get("version").getAsString();
									String main = root.get("main").getAsString();
									ModDescription desc = new ModDescription(name, version, main);
									modfiles.put(f, desc);
								}else{
									error="The modinfo.json does not contain all required information (name,version,main)!";
								}
							}else{
								error="The modinfo.json has an invalid json syntax!";
							}
						}else{
							error="The jarfile does not contain a modinfo.json!";
						}
					}
					catch(IOException e)
					{
						error="Couldn't read the jarfile!";
					}
					if(error!=null)
					{
						System.out.println(error+" ("+f.getName()+")");
					}
				}
		}
		URL[] urls = new URL[modfiles.size()];
		int i = 0;
		for(File f : modfiles.keySet())
		{
			try
			{
				urls[i] = f.toURL();
			}
			catch(MalformedURLException e)
			{
				e.printStackTrace();
			}
			i++;
		}
		URLClassLoader loader = new URLClassLoader(urls);
		for(File f : modfiles.keySet())
		{
			String error = null;
			String mainclassfile = modfiles.get(f).getMain().replace(".", "/")+".class";
			if(loader.findResource(mainclassfile) != null)
			{
				try
				{
					JarFile jf = new JarFile(f);
					Enumeration<JarEntry> en = jf.entries();
					while(en.hasMoreElements())
					{
						JarEntry je = en.nextElement();
						if(je.getName().endsWith(".class"))
						{
							loader.loadClass(je.getName().replace("/", ".").substring(0, je.getName().length()-6));
						}
					}
					Class<?> mainclass = loader.loadClass(modfiles.get(f).getMain());
					if(mainclass.getSuperclass()!=null)
					{
						if(mainclass.getSuperclass().equals(Mod.class))
						{
							Mod m = (Mod) mainclass.newInstance();
							m.setDescription(modfiles.get(f));
							mods.add(m);
						}else{
							error = "The main class is not module!";
						}
					}else{
						error = "The main class is not module!";
					}
				}
				catch(ClassNotFoundException | InstantiationException | IllegalAccessException | IOException e)
				{
					error = "Error while loading classes!";
				}
			}
			if(error!=null)
			{
				System.out.println(error+" ("+f.getName()+")");
			}
		}
		try
		{
			loader.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		for(Mod m : mods)
		{
			System.out.println(m.getName() + " (" + m.getVersion() + ") has been loaded!");
			m.onEnable();
		}
	}
	
	public static void unloadModules()
	{
		for(Mod m : mods)
		{
			m.onDisable();
			System.out.println(m.getName() + " (" + m.getVersion() + ") has been unloaded!");
		}
	}
	
	public static List<Mod> getModules()
	{
		return mods;
	}

}
