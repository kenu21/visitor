package keniu.documents;

import keniu.visitors.Visitor;

public class Magazine implements Document {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Magazine";
    }
}
