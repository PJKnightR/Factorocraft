package net.fpr.factorocraft.config;

public class ServerConfig extends BaseConfig {

    /*public final ConfigGroup infrastructure = group(0, "infrastructure", Comments.infrastructure);
    public final ConfigInt tickrateSyncTimer =
            i(20, 5, "tickrateSyncTimer", "[in Ticks]", Comments.tickrateSyncTimer, Comments.tickrateSyncTimer2);*/

    public final WorldGenConfig worldGeneration = nested(0, WorldGenConfig::new, Comments.worldGeneration);

    @Override
    public String getName() {
        return "server";
    }

    private static class Comments {
        static String worldGeneration = "Enable/disable world generation";
        /*static String schematics = "Everything related to Schematic tools";
        static String kinetics = "Parameters and abilities of Create's kinetic mechanisms";
        static String fluids = "Create's liquid manipulation tools";
        static String logistics = "Tweaks for logistical components";
        static String equipment = "Equipment and gadgets added by Create";
        static String trains = "Create's builtin Railway systems";
        static String infrastructure = "The Backbone of Create";
        static String tickrateSyncTimer =
                "The amount of time a server waits before sending out tickrate synchronization packets.";
        static String tickrateSyncTimer2 = "These packets help animations to be more accurate when tps is below 20.";*/
    }

}
