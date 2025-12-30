package keniu;

import keniu.documents.Book;
import keniu.documents.Document;
import keniu.documents.Magazine;
import keniu.documents.Newspaper;
import keniu.visitors.PrintVisitor;
import keniu.visitors.SaveVisitor;
import keniu.visitors.StatisticsVisitor;
import keniu.visitors.Visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Document> documents = List.of(new Book(), new Magazine(), new Newspaper());
        List<Visitor> visitors = List.of(new PrintVisitor(), new SaveVisitor(), new StatisticsVisitor());
        for (Visitor visitor : visitors) {
            documents.forEach(document -> document.accept(visitor));
        }
    }
}
