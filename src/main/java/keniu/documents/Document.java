package keniu.documents;

import keniu.visitors.Visitor;

public interface Document {
    void accept(Visitor visitor);
}
