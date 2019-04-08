package Iterator.OwnIterator;

import java.util.ArrayList;

public class PancakeHouseIterator implements  Iterator{

    ArrayList menuItem;
    int position = 0;

    public PancakeHouseIterator(ArrayList menuItem) {
        this.menuItem = menuItem;
    }

    public boolean hasNext() {
        if (position >= menuItem.size() || menuItem.get(position) == null){
            return false;
        } return  true;
    }

    public Object next() {
        Object menuItem1 = menuItem.get(position);
        position++;
        return menuItem1;
    }
}
