package net.karosene.morefurniture.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.karosene.morefurniture.MoreFurniture;
import net.karosene.morefurniture.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DILDO_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreFurniture.MOD_ID, "dildo"),
            FabricItemGroup.builder().displayName(Text.translatable("Dildo"))
                    .icon(() -> new ItemStack(ModItems.DILDO)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DILDO);
                        entries.add(ModItems.BIG_DILDO);
                        entries.add(ModItems.BLACK_DILDO);

                        entries.add(ModBlocks.DILDO_BLOCK);
                        entries.add(ModBlocks.RAW_DILDO_BLOCK);
                    }).build());

    public static final ItemGroup SEQUOIA_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreFurniture.MOD_ID, "sequoia"),
            FabricItemGroup.builder().displayName(Text.translatable("Sequoia"))
                    .icon(() -> new ItemStack(ModBlocks.SEQUOIA_LOG)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SEQUOIA_LOG);
                        entries.add(ModBlocks.SEQUOIA_WOOD);
                        entries.add(ModBlocks.STRIPPED_SEQUOIA_LOG);
                        entries.add(ModBlocks.STRIPPED_SEQUOIA_WOOD);
                        entries.add(ModBlocks.SEQUOIA_PLANKS);

                        entries.add(ModBlocks.SEQUOIA_STAIRS);
                        entries.add(ModBlocks.SEQUOIA_SLAB);
                        entries.add(ModBlocks.SEQUOIA_BUTTON);
                        entries.add(ModBlocks.SEQUOIA_PRESSURE_PLATE);
                        entries.add(ModBlocks.SEQUOIA_FENCE);
                        entries.add(ModBlocks.SEQUOIA_FENCE_GATE);
                        entries.add(ModBlocks.SEQUOIA_TRAPDOOR);
                        entries.add(ModBlocks.SEQUOIA_DOOR);
                    }).build());

    public static void registerItemGroups() {
        MoreFurniture.LOGGER.info("Registering Item Groups for " + MoreFurniture.MOD_ID);
    }
}