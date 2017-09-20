package de.ropemc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Mappings {

    private static Map<String, String> MC188Classes = new HashMap<>(); // 1.String: unobf-class, 2.String: obf-class; example: net.minecraft.client.renderer.WorldVertexBufferUploader : bfe
    private static Map<String, String> MC188Fields = new HashMap<>(); // 1.String: unobf-field, 2.String: obf-field; example: net.minecraft.init.Items.record_13 : zy.cq
    private static Map<String, String> MC188Methods = new HashMap<>(); // 1.String: unobf-method, 2.String: obf-method; example: net/minecraft/entity/item/EntityMinecart.func_70495_a : va/a

    static {

        try {

            InputStream in = Mappings.class.getResourceAsStream("188.srg");
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String line;

            while ((line = br.readLine()) != null) {

                line = line.replace("/", ".");

                if (line.startsWith("CL:")) {

                    line = line.substring(4);

                    String[] split = line.split(" ");
                    MC188Classes.put(split[0], split[1]);

                } else if (line.startsWith("FD:")) {

                    line = line.substring(4);

                    String[] split = line.split(" ");
                    String[] nameSplit = split[1].split(".");
                    MC188Fields.put(split[0], nameSplit[nameSplit.length - 1]);

                } else if (line.startsWith("MD:")) {

                    line = line.substring(4);

                    String[] split = line.split(" ");
                    String[] nameSplit = split[2].split(".");
                    MC188Methods.put(split[0], nameSplit[nameSplit.length - 1]);

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String getClassName(MCVersion version, String clazz) {

        switch (version) {

            case MC1_8_8:
                return MC188Classes.get(clazz);

        }

        return null;

    }

    public static String getFieldName(MCVersion version, String fullName) {

        switch (version) {

            case MC1_8_8:
                return MC188Fields.get(fullName);

        }

        return null;
    }

    public static String getMethodName(MCVersion version, String fullName) {

        switch (version) {

            case MC1_8_8:
                return MC188Methods.get(fullName);

        }

        return null;
    }

    public enum MCVersion {
        MC1_8_8
    }

}
