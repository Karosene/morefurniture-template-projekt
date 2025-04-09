package net.karosene.morefurniture;

import com.jcraft.jorbis.Block;
import net.fabricmc.api.ModInitializer;
import net.karosene.morefurniture.block.ModBlocks;
import net.karosene.morefurniture.item.ModItemGroups;
import net.karosene.morefurniture.item.ModItems;
import net.minecraft.block.AbstractBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreFurniture implements ModInitializer {
	public static final String MOD_ID = "morefurniture";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	//public static final AbstractBlock VERTICAL_SEQUOIA_SLAB = new Block(AbstractBlock.Settings.create().strength(4));

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}