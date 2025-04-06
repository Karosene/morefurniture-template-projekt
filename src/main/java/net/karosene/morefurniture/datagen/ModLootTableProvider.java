package net.karosene.morefurniture.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.karosene.morefurniture.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //sequoia woods
        addDrop(ModBlocks.SEQUOIA_LOG);
        addDrop(ModBlocks.SEQUOIA_WOOD);
        addDrop(ModBlocks.STRIPPED_SEQUOIA_LOG);
        addDrop(ModBlocks.STRIPPED_SEQUOIA_WOOD);
        addDrop(ModBlocks.SEQUOIA_PLANKS);

        //dildo items
        addDrop(ModBlocks.DILDO_BLOCK);
        addDrop(ModBlocks.RAW_DILDO_BLOCK);
    }
}