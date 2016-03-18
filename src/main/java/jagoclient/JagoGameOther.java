package jagoclient;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

/**
 * This applet (containing a button only) is used to start the display of a game,
 * when it is pressed. The display is done via a JagoGame applet, which must
 * be on the same page. The game to be displayed is chosen via a Game applet
 * parameter.
 *
 * @see JagoGame
 */

public class JagoGameOther extends Applet
        implements ActionListener {
    Button B;
    String Game;

    synchronized public void init() {
        setLayout(new BorderLayout());
        add("Center", B = new Button(Global.resourceString("Load")));
        B.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String Game = getParameter("Game");
        Enumeration n = getAppletContext().getApplets();
        try {
            while (n.hasMoreElements()) {
                Object a = n.nextElement();
                if (a instanceof JagoGame) {
                    JagoGame j = (JagoGame) a;
                    j.load(Game);
                    break;
                }
            }
        } catch (Exception ex) {
        }
    }
}