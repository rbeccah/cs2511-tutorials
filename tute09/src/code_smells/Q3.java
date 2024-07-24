package code_smells;

import java.util.ArrayList;
import java.util.List;

class MathLibrary {
    private List<Book> books = new ArrayList<>();

    int sumTitles() {
        int total = 0;
        for (Book b : books) {
            total += b.getTitleLength();
        }
        return total;
    }
}

class Book {
    private String title; // Our system just models books as titles (content doesn't matter)
    private String author;
    private String ISBN;

    public int getTitleLength() {
        return 0;
    }
}