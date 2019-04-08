package Iterator.OwnIterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waiterss waiterss = new Waiterss(pancakeHouseMenu, dinerMenu);

        waiterss.printMenu();
    }
}
