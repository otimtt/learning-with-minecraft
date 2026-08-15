package com.learningwithminecraft.api;

import net.minecraft.client.gui.screen.Screen;

public final class LearningWithMinecraftScreens {
    private LearningWithMinecraftScreens() {
    }

    public static Screen createLanguageSetup(Screen parent) {
        return new com.learningwithminecraft.client.screen.LanguageSetupScreen(parent);
    }
}
