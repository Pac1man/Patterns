package Observer.OwnExample;


public class Newspaper{
    public static void main(String[] args) {
        Subscribers subscribers = new Subscribers();
        Updater updater = new Updater(subscribers);
        subscribers.setSubscribers(3, "Magnitogorsk");
        subscribers.setSubscribers(10, "Kazan");
        subscribers.setSubscribers(200, "Moscow");
    }


}
