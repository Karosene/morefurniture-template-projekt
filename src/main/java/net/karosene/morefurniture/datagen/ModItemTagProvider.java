package net.karosene.morefurniture.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.karosene.morefurniture.block.ModBlocks;
import net.karosene.morefurniture.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg){
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.SEQUOIA_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.SEQUOIA_LOG.asItem())
                .add(ModBlocks.SEQUOIA_WOOD.asItem())
                .add((ModBlocks.STRIPPED_SEQUOIA_LOG.asItem()))
                .add((ModBlocks.STRIPPED_SEQUOIA_WOOD.asItem()));
    }
}
