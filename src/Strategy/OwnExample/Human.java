package Strategy.OwnExample;

public abstract class Human {

    Profession profession;
    LiveStatus liveStatus;

    Human(){}

    public abstract void  speak();

    void someLife(){
        liveStatus.life();
    }

    void someProfession(){
        profession.work();
    }

}
