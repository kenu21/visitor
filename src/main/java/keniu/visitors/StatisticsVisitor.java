package keniu.visitors;

import keniu.documents.Book;
import keniu.documents.Magazine;
import keniu.documents.Newspaper;

public class StatisticsVisitor implements Visitor {

    @Override
    public void visit(Book book) {
        System.out.println("Collecting statistics for " + book);
    }

    @Override
    public void visit(Magazine magazine) {
        System.out.println("Collecting statistics for " + magazine);
    }

    @Override
    public void visit(Newspaper newspaper) {
        System.out.println("Collecting statistics for " + newspaper);
    }
}
