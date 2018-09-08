package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.FontRenderer")
public interface FontRenderer {
    /**
     * Render a single character with the default.png font at current (posX,posY) location...
     */
    float renderDefaultChar(int p_78266_1_, boolean p_78266_2_);

    /**
     * Render a single Unicode character at current (posX,posY) location using one of the /font/glyph_XX.png files...
     */
    float renderUnicodeChar(char p_78277_1_, boolean p_78277_2_);

    /**
     * Draws the specified string with a shadow.
     */
    int drawStringWithShadow(String text, float x, float y, int color);

    /**
     * Draws the specified string.
     */
    int drawString(String text, int x, int y, int color);

    /**
     * Draws the specified string.
     */
    int drawString(String text, float x, float y, int color, boolean dropShadow);

    /**
     * Apply Unicode Bidirectional Algorithm to string and return a new possibly reordered string for visual rendering.
     */
    String bidiReorder(String p_147647_1_);

    /**
     * Render a single line string at the current (posX,posY) and update posX
     */
    void renderStringAtPos(String p_78255_1_, boolean p_78255_2_);

    /**
     * Render string either left or right aligned depending on bidiFlag
     */
    int renderStringAligned(String text, int x, int y, int p_78274_4_, int color, boolean dropShadow);

    /**
     * Render single line string by setting GL color, current (posX,posY), and calling renderStringAtPos()
     */
    int renderString(String text, float x, float y, int color, boolean dropShadow);

    /**
     * Returns the width of this string. Equivalent of FontMetrics.stringWidth(String s).
     */
    int getStringWidth(String text);

    /**
     * Returns the width of this character as rendered.
     */
    int getCharWidth(char character);

    /**
     * Trims a string to fit a specified Width.
     */
    String trimStringToWidth(String text, int width);

    /**
     * Trims a string to a specified width, and will reverse it if par3 is set.
     */
    String trimStringToWidth(String text, int width, boolean reverse);

    /**
     * Remove all newline characters from the end of the string
     */
    String trimStringNewline(String text);

    /**
     * Splits and draws a String with wordwrap (maximum length is parameter k)
     */
    void drawSplitString(String str, int x, int y, int wrapWidth, int textColor);

    /**
     * Perform actual work of rendering a multi-line string with wordwrap and with darker drop shadow color if flag is
     * set
     */
    void renderSplitString(String str, int x, int y, int wrapWidth, boolean addShadow);

    /**
     * Returns the width of the wordwrapped String (maximum length is parameter k)
     */
    int splitStringWidth(String p_78267_1_, int p_78267_2_);

    /**
     * Set unicodeFlag controlling whether strings should be rendered with Unicode fonts instead of the default.png
     * font.
     */
    void setUnicodeFlag(boolean unicodeFlagIn);

    /**
     * Get unicodeFlag controlling whether strings should be rendered with Unicode fonts instead of the default.png
     * font.
     */
    boolean getUnicodeFlag();

    /**
     * Set bidiFlag to control if the Unicode Bidirectional Algorithm should be run before rendering any string.
     */
    void setBidiFlag(boolean bidiFlagIn);

    /**
     * Determines how many characters from the string will fit into the specified width.
     */
    int sizeStringToWidth(String str, int wrapWidth);

    /**
     * Checks if the char code is a hexadecimal character, used to set colour.
     */
    boolean isFormatColor(char colorChar);

    /**
     * Checks if the char code is O-K...lLrRk-o... used to set special formatting.
     */
    boolean isFormatSpecial(char formatChar);

    /**
     * Digests a string for nonprinting formatting characters then returns a string containing only that formatting.
     */
    String getFormatFromString(String text);

    /**
     * Get bidiFlag that controls if the Unicode Bidirectional Algorithm should be run before rendering any string
     */
    boolean getBidiFlag();

    int getColorCode(char character);
}
