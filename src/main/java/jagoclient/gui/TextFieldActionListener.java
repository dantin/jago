package jagoclient.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This is a callback class to act as an ActionListener, which calls back a
 * DoActionListener on any action passing the string name to its doAction
 * method.
 *
 * @see DoActionListener
 * @see TextFieldAction
 * @see CloseFrame#doAction
 * @see CloseDialog#doAction
 */

class TextFieldActionListener implements ActionListener {
    DoActionListener C;
    String Name;

    public TextFieldActionListener(DoActionListener c, String name) {
        C = c;
        Name = name;
    }

    public void actionPerformed(ActionEvent e) {
        C.doAction(Name);
    }
}
