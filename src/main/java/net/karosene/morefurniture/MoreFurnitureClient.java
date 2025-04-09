package net.karosene.morefurniture;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.karosene.morefurniture.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class MoreFurnitureClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SEQUOIA_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SEQUOIA_TRAPDOOR, RenderLayer.getCutout());
    }
}
