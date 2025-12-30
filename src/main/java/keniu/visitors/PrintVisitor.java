package keniu.visitors;

import keniu.documents.Book;
import keniu.documents.Magazine;
import keniu.documents.Newspaper;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(Book book) {
        System.out.println("Printing " + book);
    }

    @Override
    public void visit(Magazine magazine) {
        System.out.println("Printing " + magazine);
    }

    @Override
    public void visit(Newspaper newspaper) {
        System.out.println("Printing " + newspaper);
    }
}
