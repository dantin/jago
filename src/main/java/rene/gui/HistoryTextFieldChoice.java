package rene.gui;

import rene.util.list.ListClass;
import rene.util.list.ListElement;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class HistoryTextFieldChoice extends MyChoice
        implements ItemListener {
    HistoryTextField T;

    public HistoryTextFieldChoice(HistoryTextField t) {
        T = t;
        update();
        addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        String s = getSelectedItem();
        if (s.equals("   ")) return;
        T.doAction(s);
    }

    public void update() {
        removeAll();
        ListClass l = T.getHistory();
        ListElement e = l.last();
        if (e == null || ((String) e.content()).equals("")) add("   ");
        while (e != null) {
            String s = (String) e.content();
            if (!s.equals("")) add(s);
            e = e.previous();
        }
    }

}
