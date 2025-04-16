package net.karosene.morefurniture.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.karosene.morefurniture.MoreFurniture;
import net.karosene.morefurniture.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //dildo
    public static final Block DILDO_BLOCK = registerBlock("dildo_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_DILDO_BLOCK = registerBlock("raw_dildo_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    //sekvoje
    public static final Block SEQUOIA_LOG = registerBlock("sequoia_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block SEQUOIA_WOOD = registerBlock("sequoia_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_SEQUOIA_LOG = registerBlock("stripped_sequoia_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_SEQUOIA_WOOD = registerBlock("stripped_sequoia_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block SEQUOIA_PLANKS = registerBlock("sequoia_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block SEQUOIA_LEAVES = registerBlock("sequoia_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block SEQUOIA_SAPLING = registerBlock("sequoia_sapling",
            new SaplingBlock(ModSaplingGenerators.SEQUOIA, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    public static final Block SEQUOIA_STAIRS = registerBlock("sequoia_stairs",
            new StairsBlock(ModBlocks.SEQUOIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block SEQUOIA_SLAB = registerBlock("sequoia_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB).strength(4f)));
    public static final Block SEQUOIA_BUTTON = registerBlock("sequoia_button",
            new ButtonBlock(BlockSetType.OAK, 10, FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)));
    public static final Block SEQUOIA_PRESSURE_PLATE = registerBlock("sequoia_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block SEQUOIA_FENCE = registerBlock("sequoia_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SEQUOIA_FENCE_GATE = registerBlock("sequoia_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)));
    public static final Block SEQUOIA_DOOR = registerBlock("sequoia_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_DOOR).nonOpaque()));
    public static final Block SEQUOIA_TRAPDOOR = registerBlock("sequoia_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).nonOpaque()));


    //vertical slaby
    public static final Block VERTICAL_SEQUOIA_SLAB = new VerticalSlabBlock(AbstractBlock.
            Settings.copy(Blocks.OAK_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));
    public static final Block VERTICAL_OAK_SLAB = new VerticalSlabBlock(AbstractBlock.
            Settings.copy(Blocks.OAK_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));
    public static final Block VERTICAL_SPRUCE_SLAB = new VerticalSlabBlock(AbstractBlock.
            Settings.copy(Blocks.SPRUCE_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));
    public static final Block VERTICAL_BIRCH_SLAB = new VerticalSlabBlock(AbstractBlock.
            Settings.copy(Blocks.BIRCH_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));
    public static final Block VERTICAL_JUNGLE_SLAB = new VerticalSlabBlock(AbstractBlock.
            Settings.copy(Blocks.JUNGLE_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));
    public static final Block VERTICAL_ACACIA_SLAB = new VerticalSlabBlock(AbstractBlock.
            Settings.copy(Blocks.ACACIA_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));
    public static final Block VERTICAL_DARK_OAK_SLAB = new VerticalSlabBlock(AbstractBlock.
            Settings.copy(Blocks.DARK_OAK_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));
    public static final Block VERTICAL_MANGROVE_SLAB = new VerticalSlabBlock(AbstractBlock.
            Settings.copy(Blocks.MANGROVE_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));
    public static final Block VERTICAL_CHERRY_SLAB = new VerticalSlabBlock(AbstractBlock.
            Settings.copy(Blocks.CHERRY_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));
    public static final Block VERTICAL_BAMBOO_SLAB = new VerticalSlabBlock(AbstractBlock.
            Settings.copy(Blocks.BAMBOO_SLAB).sounds(BlockSoundGroup.BAMBOO_WOOD).hardness(2f));
    public static final Block VERTICAL_BAMBOO_MOSAIC_SLAB = new VerticalSlabBlock(AbstractBlock.
            Settings.copy(Blocks.BAMBOO_MOSAIC_SLAB).sounds(BlockSoundGroup.BAMBOO_WOOD).hardness(2f));
    public static final Block VERTICAL_CRIMSON_SLAB = new VerticalSlabBlock(AbstractBlock.
            Settings.copy(Blocks.CRIMSON_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));
    public static final Block VERTICAL_WARPED_SLAB = new VerticalSlabBlock(AbstractBlock.
            Settings.copy(Blocks.WARPED_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));

    //copper slabs
    public static final Block VERTICAL_CUT_COPPER_SLAB = new CopperVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CUT_COPPER_SLAB).sounds(BlockSoundGroup.METAL).hardness(2f).requiresTool());
    public static final Block VERTICAL_EXPOSED_CUT_COPPER_SLAB = new CopperVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER_SLAB).sounds(BlockSoundGroup.METAL).hardness(2f).requiresTool());
    public static final Block VERTICAL_WEATHERED_CUT_COPPER_SLAB = new CopperVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER_SLAB).sounds(BlockSoundGroup.METAL).hardness(2f).requiresTool());
    public static final Block VERTICAL_OXIDIZED_CUT_COPPER_SLAB = new CopperVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER_SLAB).sounds(BlockSoundGroup.METAL).hardness(2f).requiresTool());

    public static final Block VERTICAL_WAXED_CUT_COPPER_SLAB = new CopperVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER_SLAB).sounds(BlockSoundGroup.METAL).hardness(2f).requiresTool());
    public static final Block VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB = new CopperVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB).sounds(BlockSoundGroup.METAL).hardness(2f).requiresTool());
    public static final Block VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB = new CopperVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB).sounds(BlockSoundGroup.METAL).hardness(2f).requiresTool());
    public static final Block VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB = new CopperVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB).sounds(BlockSoundGroup.METAL).hardness(2f).requiresTool());

    //others
    public static final Block VERTICAL_STONE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_SMOOTH_STONE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_SANDSTONE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_CUT_SANDSTONE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_COBBLESTONE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_BRICK_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_STONE_BRICK_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_NETHER_BRICK_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_QUARTZ_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_RED_SANDSTONE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_CUT_RED_SANDSTONE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_PURPUR_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_PRISMARINE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_PRISMARINE_BRICK_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICK_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_DARK_PRISMARINE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_POLISHED_GRANITE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_SMOOTH_RED_SANDSTONE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_MOSSY_STONE_BRICK_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICK_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_POLISHED_DIORITE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_MOSSY_COBBLESTONE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_END_STONE_BRICK_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_SMOOTH_SANDSTONE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_SMOOTH_QUARTZ_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_GRANITE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_ANDESITE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ANDESITE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_RED_NETHER_BRICK_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICK_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_POLISHED_ANDESITE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_DIORITE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_BLACKSTONE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BLACKSTONE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_POLISHED_BLACKSTONE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_COBBLED_DEEPSLATE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_POLISHED_DEEPSLATE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_DEEPSLATE_BRICK_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_DEEPSLATE_TILE_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());
    public static final Block VERTICAL_MUD_BRICK_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICK_SLAB).sounds(BlockSoundGroup.MUD_BRICKS).hardness(2f).requiresTool());

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreFurniture.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreFurniture.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MoreFurniture.LOGGER.info("Registering ModBlocks for " + MoreFurniture.MOD_ID);
    }
}