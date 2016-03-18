package jagoclient.gui;

import jagoclient.Global;

import java.awt.*;

/**
 * A label in a specified font.
 */

public class MyLabel extends Label {
    public MyLabel(String s) {
        super(s);
        setFont(Global.SansSerif);
    }

    public void paint(Graphics g) {
        Container c = getParent();
        if (c != null) setBackground(c.getBackground());
        super.paint(g);
    }
}
