package de.ropemc.mods;

public class ModDescription {

    private String name;
    private String version;
    private String main;

    public ModDescription(String name, String version, String main) {
        this.name = name;
        this.version = version;
        this.main = main;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getMain() {
        return main;
    }

}
