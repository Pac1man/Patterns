package Iterator.JavaIterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove(){
        if (position <= 0){
            throw new IllegalStateException("You cant remove");
        }
        if (list[position-1] != null){
            for (int i = position - 1; i < (list.length-1); i++){
                list[i] = list[i+1];
            }
            list[list.length-1] = null;
        }
    }
}
