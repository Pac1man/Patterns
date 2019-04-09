package Visitor.codelab;

public interface Visitor {
    void VisitElementA(ElementA el);
    void VisitElementB(ElementB el);
    void VisitCompositeElement(CompositeElement el);
}