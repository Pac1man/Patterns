package Iterator.Linker;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu(
                "Pancake house menu", "Breakfast");
        MenuComponent dinerMenu = new Menu(
                "Diner menu", "lunch");
        MenuComponent cafeMenu = new Menu(
                "Cafe Menu", "Dinner");
        MenuComponent dessertMenu = new Menu(
                "Dessert menu", "Dessert");

        MenuComponent allMenus = new Menu("All Menus", "0000");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);


        dinerMenu.add(new MenuItem(
                "Pasta", "Spaghetti", true, 4));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Apple Pit", "Apple", true, 1.4));

        Waiters waitress = new Waiters(allMenus);
        waitress.printMenu();
    }
}
