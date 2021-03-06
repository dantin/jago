package rene.gui;

import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * A text Button with a midifyable Font. The button
 * may also be triggered by a keyboard return.
 * <p>
 * This button class is used in DoActionListener interfaces.
 */

public class ButtonAction extends Button {
    DoActionListener C;
    String Name;
    ActionTranslator AT;

    public ButtonAction(DoActionListener c, String s, String name) {
        super(s);
        C = c;
        Name = name;
        addActionListener(AT = new ActionTranslator(c, name));
        if (Global.NormalFont != null) setFont(Global.NormalFont);
        if (Global.ControlBackground != null) setBackground(Global.ControlBackground);
    }

    public ButtonAction(DoActionListener c, String s) {
        this(c, s, s);
    }

    public ActionEvent getAction() {
        return AT.E;
    }
}
