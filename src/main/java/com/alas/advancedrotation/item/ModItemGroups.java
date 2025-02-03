package com.alas.advancedrotation.item;

import com.alas.advancedrotation.AdvancedRotation;
import com.alas.advancedrotation.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ADVANCED_ROTATION = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(AdvancedRotation.MOD_ID, "advanced_rotation_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.TUNGSTEN_NUGGET))
                    .displayName(Text.translatable("itemgroup.advancedrotation.advanced_rotation_items"))
                    .entries((displayContext, entries) -> {
                        //Items
                        entries.add(ModItems.RAW_TUNGSTEN);
                        entries.add(ModItems.TUNGSTEN_NUGGET);
                        entries.add(ModItems.TUNGSTEN_INGOT);
                        //Blocks
                        entries.add(ModBlocks.TUNGSTEN_ORE);
                        entries.add(ModBlocks.TUNGSTEN_BLOCK);
                    })
                    .build()
            );

    public static void registerItemGroups() {
        AdvancedRotation.LOGGER.info("Registering Item Groups for: " + AdvancedRotation.MOD_ID);
    }
}
