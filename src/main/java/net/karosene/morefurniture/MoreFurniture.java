package net.karosene.morefurniture;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.karosene.morefurniture.block.ModBlocks;
import net.karosene.morefurniture.item.ModItemGroups;
import net.karosene.morefurniture.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.karosene.morefurniture.block.ModBlocks.*;

public class MoreFurniture implements ModInitializer {
	public static final String MOD_ID = "morefurniture";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		registerBlockItem("vertical_sequoia_slab", VERTICAL_SEQUOIA_SLAB);
		registerBlockItem("vertical_oak_slab", VERTICAL_OAK_SLAB);
		registerBlockItem("vertical_spruce_slab", VERTICAL_SPRUCE_SLAB);
		registerBlockItem("vertical_birch_slab", VERTICAL_BIRCH_SLAB);
		registerBlockItem("vertical_jungle_slab", VERTICAL_JUNGLE_SLAB);
		registerBlockItem("vertical_acacia_slab", VERTICAL_ACACIA_SLAB);
		registerBlockItem("vertical_dark_oak_slab", VERTICAL_DARK_OAK_SLAB);
		registerBlockItem("vertical_mangrove_slab", VERTICAL_MANGROVE_SLAB);
		registerBlockItem("vertical_cherry_slab", VERTICAL_CHERRY_SLAB);
		registerBlockItem("vertical_bamboo_slab", VERTICAL_BAMBOO_SLAB);
		registerBlockItem("vertical_bamboo_mosaic_slab", VERTICAL_BAMBOO_MOSAIC_SLAB);
		registerBlockItem("vertical_crimson_slab", VERTICAL_CRIMSON_SLAB);
		registerBlockItem("vertical_warped_slab", VERTICAL_WARPED_SLAB);

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		initCreativePlacement();
	}

	private void registerBlockItem(String path, Block block) {
		Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, path), block);
		Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), new BlockItem(block, new Item.Settings()));
	}

	private void initCreativePlacement() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
			content.addBefore(Items.OAK_SLAB, VERTICAL_OAK_SLAB);
			content.addBefore(Items.SPRUCE_SLAB, VERTICAL_SPRUCE_SLAB);
			content.addBefore(Items.BIRCH_SLAB, VERTICAL_BIRCH_SLAB);
			content.addBefore(Items.JUNGLE_SLAB, VERTICAL_JUNGLE_SLAB);
			content.addBefore(Items.ACACIA_SLAB, VERTICAL_ACACIA_SLAB);
			content.addBefore(Items.DARK_OAK_SLAB, VERTICAL_DARK_OAK_SLAB);
			content.addBefore(Items.CRIMSON_SLAB, VERTICAL_CRIMSON_SLAB);
			content.addBefore(Items.WARPED_SLAB, VERTICAL_WARPED_SLAB);
			content.addBefore(Items.MANGROVE_SLAB, VERTICAL_MANGROVE_SLAB);
			content.addBefore(Items.CHERRY_SLAB, VERTICAL_CHERRY_SLAB);
			content.addBefore(Items.BAMBOO_SLAB, VERTICAL_BAMBOO_SLAB);
			content.addBefore(Items.BAMBOO_MOSAIC_SLAB, VERTICAL_BAMBOO_MOSAIC_SLAB);
		});
	}
}