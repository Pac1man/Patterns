package Decorator.OwnExample;

public class HDD extends Accessories{
    Laptop laptop;

    public HDD(Laptop laptop){this.laptop = laptop;}
    public String getName(){return laptop.getName() + ", HDD";}
    public double cost(){return  30 + laptop.cost();}
}
