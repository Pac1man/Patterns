package GoodExample;

public class StarbuzzCoffe {
    public static void main(String[] args) {
        Bevarage bevarage = new Espresso();
        System.out.println(bevarage.getDescription()
         + "$" + bevarage.cost());

        Bevarage bevarage1 = new HouseBlend();
        bevarage1 = new Mocha(bevarage1);
        bevarage1 = new Mocha(bevarage1);
        bevarage1 = new Whip(bevarage1);

        System.out.println(bevarage1.getDescription() + "$" +
                bevarage1.cost());

        Bevarage bevarage2 = new HouseBlend();
        bevarage2 = new Mocha(bevarage2);
        bevarage2 = new Whip(bevarage2);
        System.out.println(bevarage2.getDescription() + "$" +
                bevarage2.cost());
    }
}
