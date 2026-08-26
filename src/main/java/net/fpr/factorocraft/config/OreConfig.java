package net.fpr.factorocraft.config;

public class OreConfig extends BaseConfig {

    //Randomite Ore Veins
    public final ConfigInt randomiteCommonDropWeight = i(100, 0, 1000, "randomiteCommonDropWeight", Comments.randomiteCommonDropWeight);
    public final ConfigInt randomiteUncommonDropWeight = i(75, 0, 1000, "randomiteUncommonDropWeight", Comments.randomiteUncommonDropWeight);
    public final ConfigInt randomiteRareDropWeight = i(50, 0, 1000, "randomiteRareDropWeight", Comments.randomiteRareDropWeight);
    public final ConfigInt randomiteSuperRareDropWeight = i(20, 0, 1000, "randomiteSuperRareDropWeight", Comments.randomiteSuperRareDropWeight);
    public final ConfigInt randomiteUltraRareDropWeight = i(10, 0, 1000, "randomiteUltraRareDropWeight", Comments.randomiteUltraRareDropWeight);
    public final ConfigInt randomiteHyperRareDropWeight = i(5, 0, 1000, "randomiteHyperRareDropWeight", Comments.randomiteHyperRareDropWeight);
    public final ConfigInt randomiteLegendaryDropWeight = i(3, 0, 1000, "randomiteLegendaryDropWeight", Comments.randomiteLegendaryDropWeight);
    public final ConfigInt randomiteMythicalDropWeight = i(1, 0, 1000, "randomiteMythicalDropWeight", Comments.randomiteMythicalDropWeight);

    @Override
    public String getName() {
        return "ore";
    }

    private static class Comments {
        //Randomite Ore Veins
        static String randomiteCommonDropWeight = "Weight of common Randomite drops.";
        static String randomiteUncommonDropWeight = "Weight of uncommon Randomite drops.";
        static String randomiteRareDropWeight = "Weight of rare Randomite drops.";
        static String randomiteSuperRareDropWeight = "Weight of super rare Randomite drops.";
        static String randomiteUltraRareDropWeight = "Weight of ultra rare Randomite drops.";
        static String randomiteHyperRareDropWeight = "Weight of hyper rare Randomite drops.";
        static String randomiteLegendaryDropWeight = "Weight of legendary Randomite drops.";
        static String randomiteMythicalDropWeight = "Weight of mythical Randomite drops.";
    }

}
