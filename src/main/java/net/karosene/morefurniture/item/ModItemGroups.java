package net.karosene.morefurniture.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.karosene.morefurniture.MoreFurniture;
import net.karosene.morefurniture.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DILDO_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreFurniture.MOD_ID, "dildo"),
            FabricItemGroup.builder().displayName(Text.translatable("Dildo"))
                    .icon(() -> new ItemStack(ModItems.DILDO)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DILDO);
                        entries.add(ModItems.BIG_DILDO);
                        entries.add(ModItems.BLACK_DILDO);

                        entries.add(ModBlocks.DILDO_BLOCK);
                        entries.add(ModBlocks.RAW_DILDO_BLOCK);
                    }).build());

    public static final ItemGroup SEQUOIA_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreFurniture.MOD_ID, "sequoia"),
            FabricItemGroup.builder().displayName(Text.translatable("Sequoia"))
                    .icon(() -> new ItemStack(ModBlocks.SEQUOIA_LOG)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SEQUOIA_LOG);
                        entries.add(ModBlocks.SEQUOIA_WOOD);
                        entries.add(ModBlocks.STRIPPED_SEQUOIA_LOG);
                        entries.add(ModBlocks.STRIPPED_SEQUOIA_WOOD);
                        entries.add(ModBlocks.SEQUOIA_PLANKS);

                        entries.add(ModBlocks.SEQUOIA_STAIRS);
                        entries.add(ModBlocks.SEQUOIA_SLAB);
                        entries.add(ModBlocks.SEQUOIA_BUTTON);
                        entries.add(ModBlocks.SEQUOIA_PRESSURE_PLATE);
                        entries.add(ModBlocks.SEQUOIA_FENCE);
                        entries.add(ModBlocks.SEQUOIA_FENCE_GATE);
                        entries.add(ModBlocks.SEQUOIA_TRAPDOOR);
                        entries.add(ModBlocks.SEQUOIA_DOOR);
                        entries.add(ModBlocks.VERTICAL_SEQUOIA_SLAB);

                        entries.add(ModBlocks.SEQUOIA_LEAVES);
                        entries.add(ModBlocks.SEQUOIA_SAPLING);
                    }).build());

    public static final ItemGroup VERTICAL_SLABS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreFurniture.MOD_ID, "vertical_slabs"),
            FabricItemGroup.builder().displayName(Text.translatable("Vertical Slabs"))
                    .icon(() -> new ItemStack(ModBlocks.VERTICAL_OAK_SLAB)).entries((displayContext, entries) -> {
                        // Wood-type vertical slabs
                        entries.add(ModBlocks.VERTICAL_SEQUOIA_SLAB);
                        entries.add(ModBlocks.VERTICAL_OAK_SLAB);
                        entries.add(ModBlocks.VERTICAL_SPRUCE_SLAB);
                        entries.add(ModBlocks.VERTICAL_BIRCH_SLAB);
                        entries.add(ModBlocks.VERTICAL_JUNGLE_SLAB);
                        entries.add(ModBlocks.VERTICAL_ACACIA_SLAB);
                        entries.add(ModBlocks.VERTICAL_DARK_OAK_SLAB);
                        entries.add(ModBlocks.VERTICAL_MANGROVE_SLAB);
                        entries.add(ModBlocks.VERTICAL_CHERRY_SLAB);
                        entries.add(ModBlocks.VERTICAL_BAMBOO_SLAB);
                        entries.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB);
                        entries.add(ModBlocks.VERTICAL_CRIMSON_SLAB);
                        entries.add(ModBlocks.VERTICAL_WARPED_SLAB);

                        // Stone-type vertical slabs
                        entries.add(ModBlocks.VERTICAL_STONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_SANDSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_BRICK_SLAB);
                        entries.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB);
                        entries.add(ModBlocks.VERTICAL_QUARTZ_SLAB);
                        entries.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_PURPUR_SLAB);
                        entries.add(ModBlocks.VERTICAL_PRISMARINE_SLAB);
                        entries.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB);
                        entries.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB);
                        entries.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB);
                        entries.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB);
                        entries.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB);
                        entries.add(ModBlocks.VERTICAL_GRANITE_SLAB);
                        entries.add(ModBlocks.VERTICAL_ANDESITE_SLAB);
                        entries.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB);
                        entries.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB);
                        entries.add(ModBlocks.VERTICAL_DIORITE_SLAB);
                        entries.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB);
                        entries.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB);
                        entries.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB);
                        entries.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB);
                        entries.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB);
                        entries.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB);
                        entries.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB);

                        // Copper vertical slabs
                        entries.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB);
                        entries.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB);
                        entries.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB);
                        entries.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB);
                        entries.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB);
                        entries.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB);
                        entries.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB);
                        entries.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB);
                    }).build());

    public static void registerItemGroups() {
        MoreFurniture.LOGGER.info("Registering Item Groups for " + MoreFurniture.MOD_ID);
    }
}