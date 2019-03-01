package Strategy.OwnExample;

public class StandartHuman extends Human {

    public StandartHuman(){
        profession = new HaveNoWork();
        liveStatus = new LivingWithMom();
    }


    public void speak() {
        System.out.println("Lol, want to watch some mem");
    }
}
