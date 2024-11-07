package code_smells;

import java.util.List;

class MathLibrary {
    private List<Book> books;

    public int sumTitles() {
        int total = 0;
        for (Book b : books) {
            total += b.getTitleLength();
        }
        return total;
    }
}

class Book {
    private Title title; // Our system just models books as titles (content doesn't matter)

    public int getTitleLength() {
        return this.title.getTitleLength();
    }
}

class Title {
    private int titleLength;

    public int getTitleLength() {
        return titleLength;
    }

    public void setTitleLength(int tL) {
        titleLength = tL;
    }
}