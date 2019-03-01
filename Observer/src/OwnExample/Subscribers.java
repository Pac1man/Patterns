package OwnExample;

import java.util.Observable;

public class Subscribers extends Observable {
    private int amount;
    private String addres;

    public Subscribers(){}

    public void subscribersChanged(){
        setChanged();
        notifyObservers();
    }

    public void setSubscribers(int amount, String addres){
        this.amount = amount;
        this.addres = addres;
        subscribersChanged();
    }

    public int getAmount() {
        return amount;
    }

    public String getAddres() {
        return addres;
    }

}

