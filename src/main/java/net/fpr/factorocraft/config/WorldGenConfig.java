package net.fpr.factorocraft.config;

public class WorldGenConfig extends BaseConfig {

    public final ConfigBool generateTestOreVein = b(false, "generateTestOreVein", Comments.generateTestOreVein);

    @Override
    public String getName() {
        return "worldGeneration";
    }

    private static class Comments {
        static String generateTestOreVein = "Allow the test ore vein to generate.";
    }

}
