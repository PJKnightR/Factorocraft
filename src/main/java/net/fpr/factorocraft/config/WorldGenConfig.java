package net.fpr.factorocraft.config;

public class WorldGenConfig extends BaseConfig {

    public final ConfigBool generateCoalOreVein = b(true, "generateCoalOreVein", Comments.generateCoalOreVein);
    public final ConfigInt coalOreVeinMaxRadius = i(4, 3, "coalOreVeinMaxRadius", Comments.coalOreVeinMaxRadius);
    //public final ConfigInt coalOreVeinAverageChunks = i(15, 1, "coalOreVeinAverageChunks", Comments.coalOreVeinAverageChunks);

    public final ConfigBool generateCopperOreVein = b(true, "generateCopperOreVein", Comments.generateCopperOreVein);
    public final ConfigInt copperOreVeinMaxRadius = i(4, 3, "copperOreVeinMaxRadius", Comments.copperOreVeinMaxRadius);
    //public final ConfigInt copperOreVeinAverageChunks = i(15, 1, "copperOreVeinAverageChunks", Comments.copperOreVeinAverageChunks);

    public final ConfigBool generateIronOreVein = b(true, "generateIronOreVein", Comments.generateIronOreVein);
    public final ConfigInt ironOreVeinMaxRadius = i(4, 3, "ironOreVeinMaxRadius", Comments.ironOreVeinMaxRadius);
    //public final ConfigInt ironOreVeinAverageChunks = i(15, 1, "ironOreVeinAverageChunks", Comments.ironOreVeinAverageChunks);

    public final ConfigBool generateRedstoneOreVein = b(true, "generateRedstoneOreVein", Comments.generateRedstoneOreVein);
    public final ConfigInt redstoneOreVeinMaxRadius = i(3, 3, "redstoneOreVeinMaxRadius", Comments.redstoneOreVeinMaxRadius);
    //public final ConfigInt redstoneOreVeinAverageChunks = i(15, 1, "redstoneOreVeinAverageChunks", Comments.redstoneOreVeinAverageChunks);

    public final ConfigBool generateStoneVein = b(true, "generateStoneVein", Comments.generateStoneVein);
    public final ConfigInt stoneVeinMaxRadius = i(4, 3, "stoneVeinMaxRadius", Comments.stoneVeinMaxRadius);
    //public final ConfigInt stoneVeinAverageChunks = i(15, 1, "stoneVeinAverageChunks", Comments.stoneVeinAverageChunks);

    public final ConfigBool generateTinOreVein = b(true, "generateTinOreVein", Comments.generateTinOreVein);
    public final ConfigInt tinOreVeinMaxRadius = i(4, 3, "tinOreVeinMaxRadius", Comments.tinOreVeinMaxRadius);
    //public final ConfigInt tinOreVeinAverageChunks = i(15, 1, "tinOreVeinAverageChunks", Comments.tinOreVeinAverageChunks);

    public final ConfigBool generateUraniumOreVein = b(true, "generateUraniumOreVein", Comments.generateUraniumOreVein);
    public final ConfigInt uraniumOreVeinMaxRadius = i(3, 3, "uraniumOreVeinMaxRadius", Comments.uraniumOreVeinMaxRadius);
    //public final ConfigInt uraniumOreVeinAverageChunks = i(15, 1, "uraniumOreVeinAverageChunks", Comments.uraniumOreVeinAverageChunks);

    @Override
    public String getName() {
        return "worldGeneration";
    }

    private static class Comments {
        static String generateCoalOreVein = "Allow Coal Ore Veins to generate.";
        static String coalOreVeinMaxRadius = "Maximum block radius for Coal Ore Veins.";
        //static String coalOreVeinAverageChunks = "The average number of chunks between Coal Ore Veins.";

        static String generateCopperOreVein = "Allow Copper Ore Veins to generate.";
        static String copperOreVeinMaxRadius = "Maximum block radius for Copper Ore Veins.";
        //static String copperOreVeinAverageChunks = "The average number of chunks between Copper Ore Veins.";

        static String generateIronOreVein = "Allow Iron Ore Veins to generate.";
        static String ironOreVeinMaxRadius = "Maximum block radius for Iron Ore Veins.";
        //static String ironOreVeinAverageChunks = "The average number of chunks between Iron Ore Veins.";

        static String generateRedstoneOreVein = "Allow Redstone Ore Veins to generate.";
        static String redstoneOreVeinMaxRadius = "Maximum block radius for Redstone Ore Veins.";
        //static String redstoneOreVeinAverageChunks = "The average number of chunks between Redstone Ore Veins.";

        static String generateStoneVein = "Allow Stone Veins to generate.";
        static String stoneVeinMaxRadius = "Maximum block radius for Stone Veins.";
        //static String stoneVeinAverageChunks = "The average number of chunks between Stone Veins.";

        static String generateTinOreVein = "Allow Tin Ore Veins to generate.";
        static String tinOreVeinMaxRadius = "Maximum block radius for Tin Ore Veins.";
        //static String tinOreVeinAverageChunks = "The average number of chunks between Tin Ore Veins.";

        static String generateUraniumOreVein = "Allow Uranium Ore Veins to generate.";
        static String uraniumOreVeinMaxRadius = "Maximum block radius for Uranium Ore Veins.";
        //static String uraniumOreVeinAverageChunks = "The average number of chunks between Uranium Ore Veins.";
    }

}
