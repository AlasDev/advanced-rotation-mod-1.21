package com.alas.advancedrotation;

import com.alas.advancedrotation.item.ModItems;
import net.fabricmc.api.ClientModInitializer;

public class AdvancedRotationClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }
}
