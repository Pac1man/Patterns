package GoodExample;

public class Whip extends CondimentDecorator {
    Bevarage bevarage;

    public Whip(Bevarage bevarage){
        this.bevarage = bevarage;
    }
    public String getDescription(){
        return bevarage.getDescription() + ", Whip";
    }
    public double cost(){return .20 + bevarage.cost();}
}
