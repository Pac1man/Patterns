package Decorator.OwnExample;

public class SSD extends Accessories {
    Laptop laptop;

    public SSD(Laptop laptop){this.laptop = laptop;}
    public String getName(){return laptop.getName() + ", SSD";}
    public double cost(){return  50 + laptop.cost();}
}
