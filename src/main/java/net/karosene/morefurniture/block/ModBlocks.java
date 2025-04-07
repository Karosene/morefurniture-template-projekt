package net.karosene.morefurniture.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.karosene.morefurniture.MoreFurniture;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block DILDO_BLOCK = registerBlock("dildo_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_DILDO_BLOCK = registerBlock("raw_dildo_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    //sekvoje
    public static final Block SEQUOIA_LOG = registerBlock("sequoia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block SEQUOIA_WOOD = registerBlock("sequoia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_SEQUOIA_LOG = registerBlock("stripped_sequoia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_SEQUOIA_WOOD = registerBlock("stripped_sequoia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));
    public static final Block SEQUOIA_PLANKS = registerBlock("sequoia_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));

    public static final Block SEQUOIA_STAIRS = registerBlock("sequoia_stairs",
            new StairsBlock(ModBlocks.SEQUOIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block SEQUOIA_SLAB = registerBlock("sequoia_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB).strength(4f)));

    public static final Block SEQUOIA_BUTTON = registerBlock("sequoia_button",
            new ButtonBlock(BlockSetType.OAK, 10, FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)));
    public static final Block SEQUOIA_PRESSURE_PLATE = registerBlock("sequoia_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)));

    public static final Block SEQUOIA_FENCE = registerBlock("sequoia_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block SEQUOIA_FENCE_GATE = registerBlock("sequoia_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)));
    public static final Block SEQUOIA_DOOR = registerBlock("sequoia_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_DOOR).nonOpaque()));
    public static final Block SEQUOIA_TRAPDOOR = registerBlock("sequoia_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).nonOpaque()));

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