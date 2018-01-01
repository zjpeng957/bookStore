package book;

import java.util.ArrayList;

public class bookCatalog {
    private ArrayList<BookSpecification> books;
    public BookSpecification getBookSpecification(String isbn) {
        for(BookSpecification b:books){
            if(b.getIsbn().equals(isbn)) return b;
        }
        return null;
    }
}
