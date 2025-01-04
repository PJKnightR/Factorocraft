package net.fpr.factorocraft.worldgen.features.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class OreVeinFeatureBuilder {
    private static final float INCLINATION = 1.5f;
    private static final float BASE_TO_LENGTH_RATIO = 1f;
    private static final int MIN_RADIUS = 2;

    public static boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context, Block generatedBlock, int maxRadius) {
        WorldGenLevel worldGenLevel = context.level();
        BlockPos origin = context.origin();
        int base_radius = context.level().getRandom().nextInt(MIN_RADIUS, maxRadius);
        int length = (int)((context.level().getRandom().nextFloat() + 0.5f) * BASE_TO_LENGTH_RATIO * (float)base_radius);
        float xoffset = (context.level().getRandom().nextFloat() - 0.5f) * INCLINATION;
        float zoffset = (context.level().getRandom().nextFloat() - 0.5f) * INCLINATION;

        for (int y = -1; y < 1; y++){
            int x = (int)(xoffset * (float)y);
            int z = (int)(zoffset * (float)y);
            float radius = (float)base_radius * (float)(length - y) / (float)(length);
            if (radius > 0.8){
                circle(context, worldGenLevel, origin.offset(x, y, z), radius, generatedBlock);
            }
        }
        return false;
    }

    public static void circle(FeaturePlaceContext<NoneFeatureConfiguration> context,
                               WorldGenLevel worldGenLevel, BlockPos center, float radius, Block generatedBlock){
        float random_finition = radius > 2f ? context.level().getRandom().nextFloat() - 0.5f : 0f;
        for (int x = -(int)(radius + 0.5f); x <= radius; x++){
            for (int z = -(int)(radius + 0.5f); z <= radius; z++){
                if (x * x + z * z < radius * radius + random_finition){
                    int moveDown = -1;

                    // Check for air, water, and replaceable blocks and move down accordingly
                    while (worldGenLevel.getBlockState(center.offset(x, moveDown, z)).getBlock() == Blocks.AIR
                            || worldGenLevel.getBlockState(center.offset(x, moveDown, z)).getBlock() == Blocks.WATER
                            || worldGenLevel.getBlockState(center.offset(x, moveDown, z)).is(BlockTags.REPLACEABLE)
                            || worldGenLevel.getBlockState(center.offset(x, moveDown, z)).is(BlockTags.REPLACEABLE_BY_TREES)
                            || worldGenLevel.getBlockState(center.offset(x, moveDown, z)).is(BlockTags.LOGS)
                            || worldGenLevel.getBlockState(center.offset(x, moveDown, z)).is(BlockTags.FLOWERS)) {
                        moveDown--;
                    }

                    worldGenLevel.setBlock(center.offset(x, 1 + moveDown, z),
                            generatedBlock.defaultBlockState(),3);
                }
            }
        }
    }
}
