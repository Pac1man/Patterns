package Adapter.OwnExample;

public class PersonTestDrive {
    public static void main(String[] args) {
        Man man = new Man();

        RichMan richMan = new RichMan();
        Person richManAdapter = new RichManAdapter(man);

        System.out.println("The Rich Man says: ");
        richMan.buyeverethink();
        richMan.leave();

        System.out.println("\nThe Man says: ");
        testMan(man);

        System.out.println("\nThe Rich Man says: ");
        testMan(richManAdapter);
    }

    static void testMan(Person person){
        person.speak();
        person.leave();
    }
}
