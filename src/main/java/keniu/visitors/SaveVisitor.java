package keniu.visitors;

import keniu.documents.Book;
import keniu.documents.Magazine;
import keniu.documents.Newspaper;

public class SaveVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("Saving " + book);
    }

    @Override
    public void visit(Magazine magazine) {
        System.out.println("Saving " + magazine);
    }

    @Override
    public void visit(Newspaper newspaper) {
        System.out.println("Saving " + newspaper);
    }
}
