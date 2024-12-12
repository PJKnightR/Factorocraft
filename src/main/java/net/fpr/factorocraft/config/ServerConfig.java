package net.fpr.factorocraft.config;

public class ServerConfig extends BaseConfig {

    public final WorldGenConfig worldGeneration = nested(0, WorldGenConfig::new, Comments.worldGeneration);

    @Override
    public String getName() {
        return "server";
    }

    private static class Comments {
        static String worldGeneration = "Enable/disable world generation";
    }

}
