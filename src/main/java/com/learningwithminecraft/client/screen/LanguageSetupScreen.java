package com.learningwithminecraft.client.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.Text;

public class LanguageSetupScreen extends Screen {
    private final Screen parent;
    private TextFieldWidget nativeLanguageField;
    private TextFieldWidget targetLanguageField;

    public LanguageSetupScreen(Screen parent) {
        super(Text.translatable("screen.learningwithminecraft.language_setup.title"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        int centerX = this.width / 2;
        int startY = this.height / 2 - 50;

        this.nativeLanguageField = new TextFieldWidget(this.textRenderer, centerX - 100, startY, 200, 20, Text.literal("Native language"));
        this.nativeLanguageField.setPlaceholder(Text.translatable("screen.learningwithminecraft.language_setup.native"));

        this.targetLanguageField = new TextFieldWidget(this.textRenderer, centerX - 100, startY + 30, 200, 20, Text.literal("Target language"));
        this.targetLanguageField.setPlaceholder(Text.translatable("screen.learningwithminecraft.language_setup.target"));

        this.addDrawableChild(this.nativeLanguageField);
        this.addDrawableChild(this.targetLanguageField);

        this.addDrawableChild(ButtonWidget.builder(Text.translatable("screen.learningwithminecraft.language_setup.save"), button -> {
            // TODO: persist selected dictionaries and language preferences
            this.close();
        }).dimensions(centerX - 100, startY + 70, 200, 20).build());
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);
        context.drawCenteredTextWithShadow(this.textRenderer, this.title, this.width / 2, 20, 0xFFFFFF);
        context.drawTextWithShadow(this.textRenderer, Text.translatable("screen.learningwithminecraft.language_setup.native"), this.width / 2 - 100, this.height / 2 - 66, 0xA0A0A0);
        context.drawTextWithShadow(this.textRenderer, Text.translatable("screen.learningwithminecraft.language_setup.target"), this.width / 2 - 100, this.height / 2 - 36, 0xA0A0A0);
        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldCloseOnEsc() {
        return true;
    }

    @Override
    public void close() {
        if (this.client != null) {
            this.client.setScreen(this.parent);
        }
    }
}

