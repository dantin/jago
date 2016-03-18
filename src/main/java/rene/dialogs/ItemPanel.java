package rene.dialogs;

import rene.gui.DoActionListener;

import java.awt.*;
import java.util.Vector;

public class ItemPanel extends Panel
        implements DoActionListener {
    public void display(ItemEditorElement e) {
    }

    public String getName() {
        return "";
    }

    public void setName(String name) {
    }

    public ItemEditorElement getElement() {
        return null;
    }

    public void newElement() {
    }

    public void help() {
    }

    public void doAction(String o) {
    }

    public void itemAction(String o, boolean flag) {
    }

    /**
     * Called, whenever an item is redefined.
     *
     * @param v    The vector of KeyboardItem.
     * @param item The currently changed item number.
     */
    public void notifyChange(Vector v, int item) {
    }

    /**
     * Called, when the extra Button was pressed.
     *
     * @return If the panel should be closed immediately.
     * @v The vector of KeyboardItem.
     */
    public boolean extra(Vector v) {
        return false;
    }
}
