package com.learningwithminecraft.forge.client.mixin;

import com.learningwithminecraft.client.screen.LanguageSetupScreen;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.OptionsScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(OptionsScreen.class)
public abstract class OptionsScreenMixin extends Screen {
    @Shadow protected abstract <T extends Element> T addRenderableWidget(T widget);

    protected OptionsScreenMixin(Component title) {
        super(title);
    }

    @Inject(method = "init", at = @At("TAIL"))
    private void learningwithminecraft$addLearnIdiomsEntry(CallbackInfo ci) {
        int buttonWidth = 98;
        int buttonHeight = 20;
        int x = this.width / 2 - buttonWidth / 2;
        int y = this.height - 28;

        this.addRenderableWidget(Button.builder(
            Component.translatable("screen.learningwithminecraft.learn_idioms"),
            button -> this.minecraft.setScreen(new LanguageSetupScreen(this))
        ).bounds(x, y, buttonWidth, buttonHeight).build());
    }
}
