package Iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList();

        addItem("KB", "something", true, 2.11);
        addItem("Pancake", "something", true, 2.1);
        addItem("Waffles", "something", true, 1);
        addItem("Blueberry Pancakes", "something", true, 3);
    }

    public void addItem(String name, String description,
                        boolean vegetarioan, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarioan, price);
        menuItems.add(menuItem);
    }


    public Iterator createIterator(){
        return new PancakeHouseIterator(menuItems);
    }
}
