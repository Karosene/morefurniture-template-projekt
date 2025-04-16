package net.karosene.morefurniture.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.karosene.morefurniture.block.ModBlocks;
import net.karosene.morefurniture.item.ModItems;
import net.minecraft.data.client.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool sequoiaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SEQUOIA_PLANKS);
        sequoiaPool.stairs(ModBlocks.SEQUOIA_STAIRS);
        sequoiaPool.slab(ModBlocks.SEQUOIA_SLAB);
        sequoiaPool.fence(ModBlocks.SEQUOIA_FENCE);
        sequoiaPool.fenceGate(ModBlocks.SEQUOIA_FENCE_GATE);
        sequoiaPool.pressurePlate(ModBlocks.SEQUOIA_PRESSURE_PLATE);
        sequoiaPool.button(ModBlocks.SEQUOIA_BUTTON);
        blockStateModelGenerator.registerDoor(ModBlocks.SEQUOIA_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SEQUOIA_TRAPDOOR);

        blockStateModelGenerator.registerLog(ModBlocks.SEQUOIA_LOG).log(ModBlocks.SEQUOIA_LOG).wood(ModBlocks.SEQUOIA_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SEQUOIA_LOG).log(ModBlocks.STRIPPED_SEQUOIA_LOG).wood(ModBlocks.STRIPPED_SEQUOIA_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SEQUOIA_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.SEQUOIA_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.SEQUOIA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DILDO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_DILDO_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DILDO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIG_DILDO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_DILDO, Models.GENERATED);

        itemModelGenerator.register(ModBlocks.SEQUOIA_SAPLING.asItem(), Models.GENERATED);
    }
}