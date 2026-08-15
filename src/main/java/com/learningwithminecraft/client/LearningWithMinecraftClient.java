package com.learningwithminecraft.client;

import com.learningwithminecraft.client.screen.LanguageSetupScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.minecraft.client.MinecraftClient;

public class LearningWithMinecraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientLifecycleEvents.CLIENT_STARTED.register(client -> openSetupScreen(client));
    }

    private void openSetupScreen(MinecraftClient client) {
        if (client.currentScreen == null) {
            client.setScreen(new LanguageSetupScreen(null));
        }
    }
}

