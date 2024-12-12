package net.fpr.factorocraft.config;

public class WorldGenConfig extends BaseConfig {

    public final ConfigBool generateCopperOreVein = b(true, "generateCopperOreVein", Comments.generateCopperOreVein);
    public final ConfigBool generateIronOreVein = b(true, "generateIronOreVein", Comments.generateIronOreVein);

    @Override
    public String getName() {
        return "worldGeneration";
    }

    private static class Comments {
        static String generateCopperOreVein = "Allow Copper Ore Veins to generate.";
        static String generateIronOreVein = "Allow Iron Ore Veins to generate.";
    }

}
