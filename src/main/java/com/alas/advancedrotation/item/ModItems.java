package com.alas.advancedrotation.item;

import com.alas.advancedrotation.AdvancedRotation;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //items to be registered
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_NUGGET = registerItem("tungsten_nugget", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item(new Item.Settings()));

    //method to register items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AdvancedRotation.MOD_ID, name), item);
    }

    //register items
    public static void registerModItems() {
        AdvancedRotation.LOGGER.info("Registering mod Items for: " + AdvancedRotation.MOD_ID);

        //item group = creative tab group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RAW_TUNGSTEN);
            entries.add(TUNGSTEN_NUGGET);
            entries.add(TUNGSTEN_INGOT);
        });
    }
}
