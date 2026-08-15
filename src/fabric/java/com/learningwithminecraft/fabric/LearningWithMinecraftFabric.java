package com.learningwithminecraft.fabric;

import com.learningwithminecraft.LearningWithMinecraftMod;
import net.fabricmc.api.ModInitializer;

public class LearningWithMinecraftFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        LearningWithMinecraftMod.init();
    }
}
