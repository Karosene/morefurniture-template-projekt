package net.karosene.morefurniture.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.karosene.morefurniture.MoreFurniture;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DILDO = registerItem("dildo", new Item(new Item.Settings()));
    public static final Item BIG_DILDO = registerItem("big_dildo", new Item(new Item.Settings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(DILDO);
        entries.add(BIG_DILDO);
    }

    private static Item registerItem(String name, Item item) {
        //return Registry.register(Registries.ITEM, new Identifier(MoreFurniture.MOD_ID, name), item);
        return Registry.register(Registries.ITEM, Identifier.of(MoreFurniture.MOD_ID, name), item);
    }


    public static void registerModItems() {
        MoreFurniture.LOGGER.info("Registering Mod Items for: " + MoreFurniture.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);

    }
}
