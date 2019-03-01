package Observer.OwnExample;

import java.util.Observable;
import java.util.Observer;

public class Updater implements Observer {
    Observable observable;
    private int amount;
    private String addres;

    public Updater(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    public void display(){
        System.out.println("Amount of subs: " + amount + "and they living in: " + addres );

    }

    public void update(Observable obs, Object arg){
        if (obs instanceof Subscribers){
            Subscribers subscribers = (Subscribers)obs;
            this.amount = subscribers.getAmount();
            this.addres = subscribers.getAddres();
            display();
        }
    }
}
