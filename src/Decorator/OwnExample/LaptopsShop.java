package Decorator.OwnExample;

public class LaptopsShop {
    public static void main(String[] args) {
        Laptop laptop = new HP();
        System.out.println(laptop.getName() + ", " + laptop.cost() + "$");

        Laptop laptop1 = new Lenovo();
        laptop1 = new SSD(laptop1);
        laptop1 = new HDD(laptop1);

        System.out.println(laptop1.getName() + ", " + laptop1.cost() + "$");

        Laptop laptop2 = new HP();
        laptop2 = new HDD(laptop2);
        laptop2 = new SSD(laptop2);
        // Comment
        System.out.println(laptop2.getName() + ", " + laptop2.cost() + "$");
    }
}
