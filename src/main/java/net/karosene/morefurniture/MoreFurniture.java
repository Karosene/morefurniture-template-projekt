package net.karosene.morefurniture;

import net.fabricmc.api.ModInitializer;

import net.karosene.morefurniture.block.ModBlocks;
import net.karosene.morefurniture.item.ModItemGroups;
import net.karosene.morefurniture.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreFurniture implements ModInitializer {
	public static final String MOD_ID = "morefurniture";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}