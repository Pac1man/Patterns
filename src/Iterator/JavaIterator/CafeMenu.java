package Iterator.JavaIterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
    Hashtable menuItems = new Hashtable();

    public CafeMenu(){
        addItem("Burger", "something", false, 2);
        addItem("Soup", "something", true, 3.99);
        addItem("Burrito", "something", false, 2);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator(){
        return menuItems.values().iterator();
    }

}
