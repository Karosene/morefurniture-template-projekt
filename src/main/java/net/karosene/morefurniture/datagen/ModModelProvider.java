package net.karosene.morefurniture.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.karosene.morefurniture.block.ModBlocks;
import net.karosene.morefurniture.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool rubyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DILDO_BLOCK);

        blockStateModelGenerator.registerLog(ModBlocks.SEQUOIA_LOG).log(ModBlocks.SEQUOIA_LOG).wood(ModBlocks.SEQUOIA_LOG);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DILDO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIG_DILDO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_DILDO, Models.GENERATED);
    }
}