package com.alas.advancedrotation;

import com.alas.advancedrotation.block.ModBlocks;
import com.alas.advancedrotation.item.ModItemGroups;
import com.alas.advancedrotation.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancedRotation implements ModInitializer {

	public static final String MOD_ID = "advancedrotation";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}