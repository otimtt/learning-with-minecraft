package com.learningwithminecraft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class LearningWithMinecraftMod {
    public static final String MOD_ID = "learningwithminecraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private LearningWithMinecraftMod() {
    }

    public static void init() {
        LOGGER.info("Learning with Minecraft initialized.");
    }
}
