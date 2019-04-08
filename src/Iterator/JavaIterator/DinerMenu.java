package Iterator.JavaIterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static  final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarioan BLT", "something", true, 2.99);
        addItem("BLT", "something", false, 2.99);
        addItem("Soup", "something", false, 3.29);
        addItem("Hotdog", "something", false, 1.99);
    }

    public void addItem(String name, String description,
                        boolean vegetarianm, double price){

        MenuItem menuItem = new MenuItem(name, description, vegetarianm, price);

        if (numberOfItems >= MAX_ITEMS){
            System.err.println("Sorry, menu is full");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
