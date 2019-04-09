package Visitor.codelab;


import java.util.Iterator;
import java.util.List;

public class CompositeElement implements Element {
    private List<Element> children;

    public void Accept(Visitor v) {
        Iterator<Element> childIter = children.iterator();
        while (childIter.hasNext()) {
            childIter.next().Accept(v);
        }
        v.VisitCompositeElement(this);
    }

}
