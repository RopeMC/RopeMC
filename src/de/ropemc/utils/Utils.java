package de.ropemc.utils;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Utils {
	public static ByteBuffer readImageToBuffer(InputStream imageStream) throws IOException
    {
        BufferedImage var2 = ImageIO.read(imageStream);
        int[] var3 = var2.getRGB(0, 0, var2.getWidth(), var2.getHeight(), (int[])null, 0, var2.getWidth());
        ByteBuffer var4 = ByteBuffer.allocate(4 * var3.length);
        int[] var5 = var3;
        int var6 = var3.length;

        for (int var7 = 0; var7 < var6; ++var7)
        {
            int var8 = var5[var7];
            var4.putInt(var8 << 8 | var8 >> 24 & 255);
        }

        var4.flip();
        return var4;
    }
	public static long convertGitHubTimestamp(String stamp)
	{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		try
		{
			return df.parse(stamp).getTime();
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		return -1;
	}
	public static String getGitHubPushedAt(String owner,String repo)
	{
		String content = getContent("https://api.github.com/repos/"+owner+"/"+repo,null,null);
		if(content==null)return null;
		if(content.length()<1)return null;
		JsonParser parser = new JsonParser();
		JsonObject o = parser.parse(content).getAsJsonObject();
		if(o.has("pulled_at"))
		{
			return o.get("pulled_at").getAsString();
		}
		return null;
	}
	public static String getContent(String urlToRead,HashMap<String,String> header,HashMap<String,String> postdata){
		StringBuilder result = new StringBuilder();
		try
		{
			String post = null;
			if(postdata!=null)
			{
				post = getPostDataString(postdata);
			}
			URL url = new URL(urlToRead);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setReadTimeout(10000);
			conn.setConnectTimeout(15000);
			if(post!=null)
			{
				conn.setRequestMethod("POST");
			}else{
				conn.setRequestMethod("GET");
			}
			conn.setDoInput(true);
			conn.setDoOutput(true);
			if(header!=null)
			{
				for(String k : header.keySet())conn.addRequestProperty(k, header.get(k));
			}
			if(postdata!=null)
			{
				OutputStream os = conn.getOutputStream();
				BufferedWriter writer = new BufferedWriter(
				        new OutputStreamWriter(os, "UTF-8"));
				writer.write(post);
				writer.flush();
				writer.close();
				os.close();
			}
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			String line;
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			rd.close();
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}
		return result.toString();
	}
	
	private static String getPostDataString(HashMap<String, String> params){
		StringBuilder result = new StringBuilder();
        try {
        	boolean first = true;
            for(Map.Entry<String, String> entry : params.entrySet()){
                if (first)
                    first = false;
                else
                    result.append("&");

                result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                result.append("=");
                result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        }catch(Exception ex){ex.printStackTrace();}
        return result.toString();
    }
}
