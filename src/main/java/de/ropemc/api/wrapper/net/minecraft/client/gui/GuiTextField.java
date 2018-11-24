package de.ropemc.api.wrapper.net.minecraft.client.gui;

//import com.google.common.base.Predicate;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiTextField")
public interface GuiTextField {

    void deleteFromCursor(int var0);

    void deleteWords(int var0);

    void drawCursorVertical(int var0, int var1, int var2, int var3);

    void drawTextBox();

    int func_146197_a(int var0, int var1, boolean var2);

    //void func_175205_a(Predicate var0);

    //void func_175207_a(GuiPageButtonList$GuiResponder var0);

    int getCursorPosition();

    boolean getEnableBackgroundDrawing();

    int getId();

    int getMaxStringLength();

    int getNthWordFromCursor(int var0);

    int getNthWordFromPos(int var0, int var1);

    String getSelectedText();

    int getSelectionEnd();

    String getText();

    boolean getVisible();

    int getWidth();

    boolean isFocused();

    void mouseClicked(int var0, int var1, int var2);

    void moveCursorBy(int var0);

    void setCanLoseFocus(boolean var0);

    void setCursorPosition(int var0);

    void setCursorPositionEnd();

    void setCursorPositionZero();

    void setDisabledTextColour(int var0);

    void setEnableBackgroundDrawing(boolean var0);

    void setEnabled(boolean var0);

    void setFocused(boolean var0);

    void setMaxStringLength(int var0);

    void setSelectionPos(int var0);

    void setText(String var0);

    void setTextColor(int var0);

    void setVisible(boolean var0);

    boolean textboxKeyTyped(char var0, int var1);

    void updateCursorCounter();

    void writeText(String var0);

}
