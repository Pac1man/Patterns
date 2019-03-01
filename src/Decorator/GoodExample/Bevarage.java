package Decorator.GoodExample;

public abstract class Bevarage {
    String description = "Unknown beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
