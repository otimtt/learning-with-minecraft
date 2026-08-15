package com.learningwithminecraft.client.mixin;

import com.learningwithminecraft.client.screen.LanguageSetupScreen;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.client.gui.Element;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(OptionsScreen.class)
public abstract class OptionsScreenMixin {
    @Shadow protected int width;
    @Shadow protected int height;
    @Shadow protected net.minecraft.client.MinecraftClient client;
    @Shadow protected abstract <T extends Element & net.minecraft.client.gui.Drawable> T addDrawableChild(T drawable);

    @Inject(method = "init", at = @At("TAIL"))
    private void learningwithminecraft$addLearnIdiomsEntry(CallbackInfo ci) {
        int buttonWidth = 98;
        int buttonHeight = 20;
        int x = this.width / 2 - buttonWidth / 2;
        int y = this.height - 28;

        this.addDrawableChild(ButtonWidget.builder(
            Text.translatable("screen.learningwithminecraft.learn_idioms"),
            button -> {
                if (this.client != null) {
                    this.client.setScreen(new LanguageSetupScreen((OptionsScreen) (Object) this));
                }
            }
        ).dimensions(x, y, buttonWidth, buttonHeight).build());
    }
}
