package code_smells;

import java.util.List;

class MathLibrary {
    List<Book> books;

    int sumTitles() {
        int total = 0;
        for (Book b : books) {
            total += b.title.titleLength;
        }
        return total;
    }
}

class Book {
    Title title; // Our system just models books as titles (content doesn't matter)
}

class Title {
    int titleLength;

    int getTitleLength() {
        return titleLength;
    }

    void setTitleLength(int tL) {
        titleLength = tL;
    }
}