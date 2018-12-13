# RopeMC

RopeMC is an easy, fast and lightweight Modding-API for Minecraft.

## Table of Contents

- [Information](#information)
    - [Getting started](#getting-started)
        - [Dependencies](#dependencies)
    - [Installation](#installation)
        - [Windows](#windows)
        - [macOS](#macOS)
        - [GNU/Linux](#linux)
    - [Continue the installation](#continue-the-installation)
- [Information for developers](#information-for-developers)
- [Highlighted Mods](#highlighted-mods)
- [To-Do](#To-Do)
- [Server](#server)
- [Credits](#credits)
    - [Used libraries](#used-libraries)
    - [Authors](#authors)
- [License](#license)
- [Contact us](#Contact-us)
    
## Information
We're working on a Installer which should make the installation process alot easier.<br/>
### Supported minecraft versions
| Minecraft version |      Supported     |
|:-----------------:|:------------------:|
|       1.7.10      |         :x:        |
|        1.8        |      :warning:     |
|       1.8.8       | :heavy_check_mark: |
|        1.9        |      :warning:     |
|       1.9.4       |      :warning:     |
|       1.10.2      |      :warning:     |
|        1.11       |      :warning:     |
|       1.11.2      |      :warning:     |
|        1.12       |      :warning:     |
|       1.12.2      |      :warning:     |
|        1.13       |         :x:        |
|       1.13.2      |         :x:        |  

:x: = ATM fully unsupported, :warning: = Could work, :heavy_check_mark: = Working<br />
**You may consider using the old Minecraft Launcher.**
### Getting started
#### Dependencies
- RopeMC 
- Minecraft 1.8.8
- Java Runtime Enviroment 8
- JavaFX
    - This depends on your operating system. 
    On GNU/Linux, it is called most likely "openjfx" or "java-openjfx" (i.e. Debian/Ubuntu/Mint or Arch), but this depends on your distribution. 
    Otherwise it should be included in every JDK.
### Installation
Download the latest version of RopeMC from the [releases](https://github.com/RopeMC/RopeMC/releases) tab.
#### Windows
Open your .minecraft folder, which is located in Roaming. You can access it through these two methods:
```
Windows → Run → Prompt %appdata% → Enter → .minecraft
```
```
Windows + R → Prompt %appdata% → Enter → .minecraft
```
Place your downloaded .jar file into the .minecraft-directory and rename it to **RopeMC.jar**.
#### macOS
Your minecraft folder is located under 
```
*Volume*/Users/*User*/Library/Application Support/minecraft
```
which is invisible at default. How to access it is explained [here](http://macminecraft.com/minecraft-folder-on-a-mac/)!
#### GNU/Linux
Open your .minecraft folder, which is located in $HOME/.minecraft.
Access it through the terminal or a File Manager (e.g. Nemo). 
Your .minecraft-folder may be hidden because it is a dotfile-directory. 
You can toggle the visibility either through
```
View → Show hidden Files
```
or just use Ctrl+H as a shortcut. These methods should work in almost every file manager on GNU/Linux.

### Continue the installation
Open your Minecraft Launcher and create a new profile. You need to use Minecraft 1.8.8, right now it is the only supported version for RopeMC.<br/>
Enable your Advanced Java Settings, 
enable JVM-Arguments and add the following to the end of the line:
```
-javaagent:RopeMC.jar
```

Your profile should look something like this:

![alt text](https://i.ibb.co/99gBjF8/parameters.png "Screenshot - Example")<br/>
An example could be:
```
-Xmx2G -XX:+UnlockExperimentalVMOptions -XX:+UseG1GC -XX:G1NewSizePercent=20 -XX:G1ReservePercent=20 -XX:MaxGCPauseMillis=50 -XX:G1HeapRegionSize=32M -javaagent:RopeMC.jar
```
Save your changes. You should be ready to go! :thumbsup:

## How to add mods
Tip: You need to launch RopeMC at least once to continue.

After launching RopeMC, the programm should created a folder named RopeMC in your Minecraft-directory. Please place your mod in 
```
RopeMC → Mods
```
Launch Minecraft and you should be ready to go!

## Information for developers
If you want to know how to create mods, or how to modify the source code for your own needs, check out the [wiki](https://github.com/RopeMC/RopeMC/wiki)! 

## Highlighted Mods
[ConsoleMod](https://github.com/RopeMC/ConsoleMod) <br/>
[DebugMod](https://github.com/RopeMC/DebugMod)

## To-Do
- [ ] Installer
- [x] License
- [x] Insert all members
- [ ] Troubleshooting
- [ ] Website

## Server

The server is coming soon™

## Credits
### Used libraries <br/>
[Gson](https://github.com/google/gson) by Google <br/>
[Javassist](http://jboss-javassist.github.io/javassist/) by jboss-javassist
### Authors
**RopeMC is created by:**<br/>
- x7airworker
- Prezise
- JanHolger
- HGGamers
## License
We're using the MIT-License.

## Contact us
[Our Discord](https://discord.io/ropemc)

