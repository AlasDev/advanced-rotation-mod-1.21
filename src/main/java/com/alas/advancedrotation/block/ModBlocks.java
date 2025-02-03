package com.alas.advancedrotation.block;

import com.alas.advancedrotation.AdvancedRotation;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block TUNGSTEN_ORE = registerBlock(
            "tungsten_ore",
            new Block(AbstractBlock.Settings
                    .create()
                    .strength(2f)
                    .requiresTool()
                    .pistonBehavior(PistonBehavior.BLOCK)
                    .sounds(BlockSoundGroup.ANCIENT_DEBRIS)
            )
    );
    public static final Block TUNGSTEN_BLOCK = registerBlock(
            "tungsten_block",
            new Block(AbstractBlock.Settings
                    .create()
                    .strength(20.0f, 2400.0f) // 20 Hardness, 2400 Blast Resistance (2x Obsidian)
                    .requiresTool()
                    .pistonBehavior(PistonBehavior.BLOCK)
                    .sounds(BlockSoundGroup.METAL)
            )
    );

    private static Block registerBlock(String name, Block block) {
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AdvancedRotation.MOD_ID, name), block);
    };

    private static void registerBlockItems(String name, Block block) {
        Registry.register(
                Registries.ITEM,
                Identifier.of(AdvancedRotation.MOD_ID, name),
                new BlockItem(block, new Item.Settings())
        );
    }

    public static void registerModBlocks() {
        AdvancedRotation.LOGGER.info("Registering mod Blocks for: " + AdvancedRotation.MOD_ID);

        //item group = creative tab group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.TUNGSTEN_ORE);
            entries.add(ModBlocks.TUNGSTEN_BLOCK);
        });
    }
}
