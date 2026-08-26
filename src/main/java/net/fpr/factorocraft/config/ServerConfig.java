package net.fpr.factorocraft.config;

public class ServerConfig extends BaseConfig {

    public final WorldGenConfig worldGeneration = nested(0, WorldGenConfig::new, Comments.worldGeneration);
    public final OreConfig ore = nested(0, OreConfig::new, Comments.ore);

    @Override
    public String getName() {
        return "server";
    }

    private static class Comments {
        static String worldGeneration = "Enable/disable world generation";
        static String ore = "Configure Ore Vein Behavior";
    }

}
