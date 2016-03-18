package jagoclient.gui;

import jagoclient.Global;

import java.awt.*;

/**
 * A menu with a specified font.
 */

public class MyMenu extends Menu {
    public MyMenu(String l) {
        super(l);
        setFont(Global.SansSerif);
    }
}