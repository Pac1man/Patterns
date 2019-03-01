package Adapter.OwnExample;

public class RichManAdapter implements Person {
    Person person;

    public RichManAdapter(Person person){ this.person = person; }

    public void speak(){person.speak();}

    public void leave(){
        // Тут бы цикл while(try){buyeverething()}
        for(int i = 1; i < 6; i++){
            person.leave();
            System.out.println("Better then you in " + i);
        }
        System.out.println("Yes. In 5 ");
    }
}
