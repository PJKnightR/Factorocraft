package net.fpr.factorocraft.events;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.block.custom.OreVein;
import net.fpr.factorocraft.block.entity.custom.*;
import net.fpr.factorocraft.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.event.entity.living.LivingDestroyBlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = Factorocraft.MOD_ID)
    public static class ForgeEvents {

        @SubscribeEvent
        public static void onBreak(BlockEvent.BreakEvent event) {
            if (event.getState().getBlock() instanceof OreVein) {
                if (event.getPlayer() != null) {
                    if (event.getPlayer().isCreative()) {
                        ((OreVein) event.getState().getBlock()).setDestroyedByCreativePlayer(true);
                    }
                }
            }
            //event.getLevel().getBlockEntity(event.getPos()).;

            /*System.out.println("Test 1");
            BlockEntity blockEntity = event.getLevel().getBlockEntity(event.getPos());
            Optional<Item> thermalItem = Optional.empty();
            Optional<Item> mekanismItem = Optional.empty();
            Optional<Item> createItem = Optional.empty();
            Optional<Item> immersiveItem = Optional.empty();
            Optional<Item> astraItem = Optional.empty();
            Optional<Item> atm = Optional.empty();
            boolean found = false;

            if (blockEntity instanceof OreVeinEntity) {
                System.out.println("Test 2");
                //creative mode only can destroy the blocks
                if (!event.getPlayer().isCreative() || event.getPlayer() == null) {
                    System.out.println("Test 3");
                    event.setCanceled(true);
                    event.getLevel().removeBlock(blockEntity.getBlockPos(), false);
                    event.getLevel().setBlock(blockEntity.getBlockPos(), blockEntity.getBlockState(), 2);

                    //In case I do make the ore veins finite
                    /if (oreVein.getOreAmount() >= 1) {
                    //oreVein.setOreAmount(oreVein.getOreAmount());
                    //oreVein.setOreAmount(oreVein.getOreAmount() - 1);
                    //To-do: Drop Raw Ore (player or machine)
                    //event.setCanceled(true);
                    }/

                    /Optional<Item> externalItem = Registries.ITEM.stream().filter(
                            item -> Registries.ITEM.getId(item).equals(Identifier.of("external-cool-mod", "fancy_axe"))
                    ).findFirst();/

                    if (blockEntity instanceof CopperOreVeinEntity) {
                        ((CopperOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(Items.RAW_COPPER));

                    } else if (blockEntity instanceof IronOreVeinEntity) {
                        ((IronOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(Items.RAW_IRON));

                    } else if (blockEntity instanceof CoalOreVeinEntity) {
                        ((CoalOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(Items.COAL));

                    } else if (blockEntity instanceof RedstoneOreVeinEntity) {
                        ((RedstoneOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(Items.REDSTONE));

                    } else if (blockEntity instanceof UraniumOreVeinEntity) {
                        mekanismItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mekanism", "raw_uranium")));
                        immersiveItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("immersiveengineering", "raw_uranium")));

                        if (mekanismItem.isPresent() && !found) {
                            if (!mekanismItem.get().equals(Items.AIR)) {
                                ((UraniumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(mekanismItem.get()));
                                found = true;
                            }
                        }
                        if (immersiveItem.isPresent() && !found) {
                            if (!immersiveItem.get().equals(Items.AIR)) {
                                ((UraniumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(immersiveItem.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((UraniumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_URANIUM.get()));
                        }

                    } else if (blockEntity instanceof TinOreVeinEntity) {
                        thermalItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("thermal", "raw_tin")));
                        createItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("create_dd", "raw_tin")));

                        if (thermalItem.isPresent() && !found) {
                            if (!thermalItem.get().equals(Items.AIR)) {
                                ((TinOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(thermalItem.get()));
                                found = true;
                            }
                        }
                        if (createItem.isPresent() && !found) {
                            if (!createItem.get().equals(Items.AIR)) {
                                ((TinOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(createItem.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((TinOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_TIN.get()));
                        }

                    } else if (blockEntity instanceof StoneVeinEntity) {
                        ((StoneVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.STONE_CHUNK.get()));

                    } else if (blockEntity instanceof GoldOreVeinEntity) {
                        ((GoldOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(Items.RAW_GOLD));

                    } else if (blockEntity instanceof LapisOreVeinEntity) {
                        ((LapisOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(Items.LAPIS_LAZULI));

                    } else if (blockEntity instanceof LeadOreVeinEntity) {
                        thermalItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("thermal", "raw_lead")));
                        createItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfmg", "raw_lead")));

                        if (thermalItem.isPresent() && !found) {
                            if (!thermalItem.get().equals(Items.AIR)) {
                                ((LeadOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(thermalItem.get()));
                                found = true;
                            }
                        }
                        if (createItem.isPresent() && !found) {
                            if (!createItem.get().equals(Items.AIR)) {
                                ((LeadOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(createItem.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((LeadOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_LEAD.get()));
                        }

                    } else if (blockEntity instanceof LithiumOreVeinEntity) {
                        createItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfmg", "raw_lithium")));

                        if (createItem.isPresent() && !found) {
                            if (!createItem.get().equals(Items.AIR)) {
                                ((LithiumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(createItem.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((LithiumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_LITHIUM.get()));
                        }

                    } else if (blockEntity instanceof NickelOreVeinEntity) {
                        thermalItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("thermal", "raw_nickel")));
                        createItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfmg", "raw_nickel")));

                        if (thermalItem.isPresent() && !found) {
                            if (!thermalItem.get().equals(Items.AIR)) {
                                ((NickelOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(thermalItem.get()));
                                found = true;
                            }
                        }
                        if (createItem.isPresent() && !found) {
                            if (!createItem.get().equals(Items.AIR)) {
                                ((NickelOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(createItem.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((NickelOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_NICKEL.get()));
                        }

                    } else if (blockEntity instanceof SilverOreVeinEntity) {
                        thermalItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("thermal", "raw_silver")));

                        if (thermalItem.isPresent() && !found) {
                            if (!thermalItem.get().equals(Items.AIR)) {
                                ((SilverOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(thermalItem.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((SilverOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_SILVER.get()));
                        }

                    } else if (blockEntity instanceof ZincOreVeinEntity) {
                        createItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("create", "raw_zinc")));

                        if (createItem.isPresent() && !found) {
                            if (!createItem.get().equals(Items.AIR)) {
                                ((ZincOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(createItem.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((ZincOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_ZINC.get()));
                        }
                    } else if (blockEntity instanceof AluminumOreVeinEntity) {
                        immersiveItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("immersiveengineering", "raw_aluminum")));

                        if (immersiveItem.isPresent() && !found) {
                            if (!immersiveItem.get().equals(Items.AIR)) {
                                ((AluminumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(immersiveItem.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((AluminumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_ALUMINUM.get()));
                        }
                    } else if (blockEntity instanceof OsmiumOreVeinEntity) {
                        mekanismItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mekanism", "raw_osmium")));

                        if (mekanismItem.isPresent() && !found) {
                            if (!mekanismItem.get().equals(Items.AIR)) {
                                ((OsmiumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(mekanismItem.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((OsmiumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_OSMIUM.get()));
                        }
                    } else if (blockEntity instanceof TitaniumOreVeinEntity) {
                        createItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("create_the_air_wars", "rawtitanium")));

                        if (createItem.isPresent() && !found) {
                            if (!createItem.get().equals(Items.AIR)) {
                                ((TitaniumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(createItem.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((TitaniumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_TITANIUM.get()));
                        }
                    } else if (blockEntity instanceof PlatinumOreVeinEntity) {
                        atm = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("alltheores", "raw_platinum")));

                        if (atm.isPresent() && !found) {
                            if (!atm.get().equals(Items.AIR)) {
                                ((PlatinumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(atm.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((PlatinumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_PLATINUM.get()));
                        }
                    } else if (blockEntity instanceof IridiumOreVeinEntity) {
                        atm = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("alltheores", "raw_iridium")));

                        if (atm.isPresent() && !found) {
                            if (!atm.get().equals(Items.AIR)) {
                                ((IridiumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(atm.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((IridiumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_IRIDIUM.get()));
                        }
                    } else if (blockEntity instanceof TungstenOreVeinEntity) {
                        createItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("createloveandwar", "raw_tungsten")));

                        if (createItem.isPresent() && !found) {
                            if (!createItem.get().equals(Items.AIR)) {
                                ((TungstenOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(createItem.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((TungstenOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_TUNGSTEN.get()));
                        }
                    } else if (blockEntity instanceof DeshOreVeinEntity) {
                        astraItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("ad_astra", "raw_desh")));

                        if (astraItem.isPresent() && !found) {
                            if (!astraItem.get().equals(Items.AIR)) {
                                ((DeshOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(astraItem.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((DeshOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_DESH.get()));
                        }
                    } else if (blockEntity instanceof OstrumOreVeinEntity) {
                        astraItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("ad_astra", "raw_ostrum")));

                        if (astraItem.isPresent() && !found) {
                            if (!astraItem.get().equals(Items.AIR)) {
                                ((OstrumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(astraItem.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((OstrumOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_OSTRUM.get()));
                        }
                    } else if (blockEntity instanceof CaloriteOreVeinEntity) {
                        astraItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("ad_astra", "raw_calorite")));

                        if (astraItem.isPresent() && !found) {
                            if (!astraItem.get().equals(Items.AIR)) {
                                ((CaloriteOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(astraItem.get()));
                                found = true;
                            }
                        }
                        if (!found) {
                            ((CaloriteOreVeinEntity) blockEntity).dropItem((Level) event.getLevel(), new ItemStack(ModItems.RAW_CALORITE.get()));
                        }
                    }
                }
            }*/
        }
    }
}
