package keniu.visitors;

import keniu.documents.Book;
import keniu.documents.Magazine;
import keniu.documents.Newspaper;

public interface Visitor {
    void visit(Book book);

    void visit(Magazine magazine);

    void visit(Newspaper newspaper);
}
