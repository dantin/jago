package jagoclient.igs;

import jagoclient.Global;
import jagoclient.gui.*;

import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;

/**
 * This dialog is opened by an InformatioDistributor.
 */

public class InformationDialog extends CloseDialog {
    PrintWriter Out;
    JTextField Answer;
    TextArea T;
    ConnectionFrame CF;
    InformationDistributor ID;

    public InformationDialog(ConnectionFrame cf, String m, PrintWriter out,
                             InformationDistributor id) {
        super(Global.frame(), Global.resourceString("_Information_"), false);
        CF = cf;
        ID = id;
        add("North", new MyLabel(Global.resourceString("Information")));
        JPanel pm = new MyPanel();
        pm.setLayout(new BorderLayout());
        pm.add("Center", T = new TextArea());
        T.setEditable(false);
        T.setFont(Global.Monospaced);
        T.setText(m);
        pm.add("South", Answer = new TextFieldAction(this, "Answer"));
        add("Center", pm);
        JPanel p = new MyPanel();
        p.add(new ButtonAction(this, Global.resourceString("Close")));
        p.add(new ButtonAction(this, Global.resourceString("Send")));
        add("South", p);
        Out = out;
        Global.setwindow(this, "info", 300, 400);
        validate();
        ID.infodialog = this;
        show();
    }

    @Override
    public void doAction(String o) {
        Global.notewindow(this, "info");
        if (Global.resourceString("Close").equals(o)) {
            ID.infodialog = null;
            setVisible(false);
            dispose();
        } else if (Global.resourceString("Send").equals(o) || "Answer".equals(o)) {
            if (!Answer.getText().equals("")) {
                CF.command(Answer.getText());
                Answer.setText("");
            }
        } else super.doAction(o);
    }

    public void append(String s) {
        T.append(s);
    }

    @Override
    public boolean close() {
        ID.infodialog = null;
        return true;
    }

    @Override
    public void paint(Graphics g) {
        if (ID.infodialog == null) {
            setVisible(false);
            dispose();
            return;
        }
        super.paint(g);
    }
}
