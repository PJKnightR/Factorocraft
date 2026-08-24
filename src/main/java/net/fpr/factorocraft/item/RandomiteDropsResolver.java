package net.fpr.factorocraft.item;

import net.fpr.factorocraft.config.ModConfigs;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.*;

import static net.fpr.factorocraft.util.ModTags.Items.*;

public class RandomiteDropsResolver {
    public static List<Item> overworldRandomiteWeightedDrops = new ArrayList<>();
    public static List<Item> netherRandomiteWeightedDrops = new ArrayList<>();
    public static List<Item> endRandomiteWeightedDrops = new ArrayList<>();
    public static List<Item> aetherRandomiteWeightedDrops = new ArrayList<>();
    public static List<Item> moonRandomiteWeightedDrops = new ArrayList<>();
    public static List<Item> marsRandomiteWeightedDrops = new ArrayList<>();
    public static List<Item> venusRandomiteWeightedDrops = new ArrayList<>();
    public static List<Item> glacioRandomiteWeightedDrops = new ArrayList<>();

    static Random rand = new Random();

    public enum DropDimension {
        ALL,
        OVERWORLD,
        NETHER,
        END,
        AETHER,
        MOON,
        MARS,
        VENUS,
        GLACIO
    }

    public static void resolveDrops(DropDimension dim, List<TagKey<Item>> rarityTags) {

        //BuiltInRegistries.ITEM.getTagOrEmpty(OVERWORLD_COMMON_ORE_VEIN_DROP).forEach(i -> addByRarity(/*new ItemStack(*/i.value())/*, ModConfigs.server().ore.randomiteCommonDropWeight.get()*/));

        BuiltInRegistries.ITEM.getTagOrEmpty(COMMON_ORE_VEIN_DROP).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteCommonDropWeight.get(), dim));
        BuiltInRegistries.ITEM.getTagOrEmpty(UNCOMMON_ORE_VEIN_DROP).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteUncommonDropWeight.get(), dim));
        BuiltInRegistries.ITEM.getTagOrEmpty(RARE_ORE_VEIN_DROP).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteRareDropWeight.get(), dim));
        BuiltInRegistries.ITEM.getTagOrEmpty(SUPER_RARE_ORE_VEIN_DROP).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteSuperRareDropWeight.get(), dim));
        BuiltInRegistries.ITEM.getTagOrEmpty(ULTRA_RARE_ORE_VEIN_DROP).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteUltraRareDropWeight.get(), dim));
        BuiltInRegistries.ITEM.getTagOrEmpty(HYPER_RARE_ORE_VEIN_DROP).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteHyperRareDropWeight.get(), dim));
        BuiltInRegistries.ITEM.getTagOrEmpty(LEGENDARY_ORE_VEIN_DROP).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteHyperRareDropWeight.get(), dim));
        BuiltInRegistries.ITEM.getTagOrEmpty(MYTHICAL_ORE_VEIN_DROP).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteHyperRareDropWeight.get(), dim));

        BuiltInRegistries.ITEM.getTagOrEmpty(rarityTags.get(0)).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteCommonDropWeight.get(), dim));
        BuiltInRegistries.ITEM.getTagOrEmpty(rarityTags.get(1)).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteUncommonDropWeight.get(), dim));
        BuiltInRegistries.ITEM.getTagOrEmpty(rarityTags.get(2)).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteRareDropWeight.get(), dim));
        BuiltInRegistries.ITEM.getTagOrEmpty(rarityTags.get(3)).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteSuperRareDropWeight.get(), dim));
        BuiltInRegistries.ITEM.getTagOrEmpty(rarityTags.get(4)).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteUltraRareDropWeight.get(), dim));
        BuiltInRegistries.ITEM.getTagOrEmpty(rarityTags.get(5)).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteHyperRareDropWeight.get(), dim));
        BuiltInRegistries.ITEM.getTagOrEmpty(rarityTags.get(6)).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteLegendaryDropWeight.get(), dim));
        BuiltInRegistries.ITEM.getTagOrEmpty(rarityTags.get(7)).forEach(i -> addWeightedDrop(i.value(), ModConfigs.server().ore.randomiteMythicalDropWeight.get(), dim));

        /*System.out.println("Weights: " + ModConfigs.server().ore.randomiteCommonDropWeight.get() + " " + ModConfigs.server().ore.randomiteUncommonDropWeight.get() + " " +
                ModConfigs.server().ore.randomiteRareDropWeight.get() + " " + ModConfigs.server().ore.randomiteSuperRareDropWeight.get() + " " +
                ModConfigs.server().ore.randomiteUltraRareDropWeight.get());*/

        /*if (ModConfigs.server().worldGeneration.randomiteCanDropCoal.get()) {
            addWeightedDrop(RandomiteDrop.COAL, ModConfigs.server().worldGeneration.randomiteCoalDropWeight.get());
            //randomiteWeightedDrops.add(new WeightedRandomiteDrop(RandomiteDrop.COAL, ModConfigs.server().worldGeneration.randomiteCoalDropWeight.get()));
        }*/

        Collections.shuffle(overworldRandomiteWeightedDrops);
        //System.out.println(randomiteWeightedDrops.toString());
        /*System.out.print("Item list: ");
        for (Item i: overworldRandomiteWeightedDrops) {
            System.out.print(i + " ");
        }
        System.out.println();*/
    }

    /*public static void addByRarity(Item drop) {
        if (drop.getTags().anyMatch(i -> i.equals(COMMON_ORE_VEIN_DROP))) {
            addWeightedDrop(drop, ModConfigs.server().ore.randomiteCommonDropWeight.get());
        }
    }*/

    public static void addWeightedDrop(Item drop, int weight, DropDimension dim) {
        for (int i = 0; i < weight; i++) {
            switch (dim) {
                case OVERWORLD:
                    overworldRandomiteWeightedDrops.add(drop);
                    break;
                case NETHER:
                    netherRandomiteWeightedDrops.add(drop);
                    break;
                case END:
                    endRandomiteWeightedDrops.add(drop);
                    break;
                case AETHER:
                    aetherRandomiteWeightedDrops.add(drop);
                    break;
                case MOON:
                    moonRandomiteWeightedDrops.add(drop);
                    break;
                case MARS:
                    marsRandomiteWeightedDrops.add(drop);
                    break;
                case VENUS:
                    venusRandomiteWeightedDrops.add(drop);
                    break;
                case GLACIO:
                    glacioRandomiteWeightedDrops.add(drop);
                    break;
            }
        }
    }

    public static Item getNextDrop(DropDimension dim) {
        /*System.out.print("Item list: ");
        for (Item i: overworldRandomiteWeightedDrops) {
            System.out.print(i + " ");
        }
        System.out.println();*/
        switch (dim) {
            case OVERWORLD:
                return overworldRandomiteWeightedDrops.get(rand.nextInt(overworldRandomiteWeightedDrops.size()));
            case NETHER:
                return netherRandomiteWeightedDrops.get(rand.nextInt(netherRandomiteWeightedDrops.size()));
            case END:
                return endRandomiteWeightedDrops.get(rand.nextInt(endRandomiteWeightedDrops.size()));
            case AETHER:
                return aetherRandomiteWeightedDrops.get(rand.nextInt(aetherRandomiteWeightedDrops.size()));
            case MOON:
                return moonRandomiteWeightedDrops.get(rand.nextInt(moonRandomiteWeightedDrops.size()));
            case MARS:
                return marsRandomiteWeightedDrops.get(rand.nextInt(marsRandomiteWeightedDrops.size()));
            case VENUS:
                return venusRandomiteWeightedDrops.get(rand.nextInt(venusRandomiteWeightedDrops.size()));
            case GLACIO:
                return glacioRandomiteWeightedDrops.get(rand.nextInt(glacioRandomiteWeightedDrops.size()));
        }
        return overworldRandomiteWeightedDrops.get(rand.nextInt(overworldRandomiteWeightedDrops.size()));
    }
}
