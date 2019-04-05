package Strategy.OwnExample;


public class MainLife {
    public static void main(String[] args) {

        Human Oleg = new StandartHuman();
        Oleg.setLiveStatus(new AloneLife());
        Oleg.someLife();
        Oleg.speak();

    }
}
