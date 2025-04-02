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
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreFurniture.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.DILDO)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DILDO);
                        entries.add(ModItems.BIG_DILDO);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);


                    }).build());


    public static void registerItemGroups() {
        MoreFurniture.LOGGER.info("Registering Item Groups for " + MoreFurniture.MOD_ID);
    }
}