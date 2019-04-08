package Iterator.Linker;

public class Waiters {
    MenuComponent allMenus;

    public Waiters(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    public void printMenu(){
        allMenus.print();
    }
}
