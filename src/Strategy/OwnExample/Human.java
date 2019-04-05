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

    void choise(){
        profession.work();
    }

    void setProfession(Profession profess){
        profession = profess;
    }
    void setLiveStatus(LiveStatus live){
        liveStatus = live;
    }

}
