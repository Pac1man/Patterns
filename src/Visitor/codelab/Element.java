package Visitor.codelab;



public interface Element {
    void Accept(Visitor v);
}

class ElementA implements Element {

    public void Accept(Visitor v) {
        v.VisitElementA(this);
    }
}

class ElementB implements Element {

    public void Accept(Visitor v) {
        v.VisitElementB(this);
    }

}
