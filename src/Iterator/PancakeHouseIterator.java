package Iterator;

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

    public Object next(){
        menuItem.get(position);
        position++;
        return menuItem;
    }
}
