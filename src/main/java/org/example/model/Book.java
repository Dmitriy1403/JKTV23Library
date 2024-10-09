package org.example.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {

    private static long count;

    private  long id;

    private String title;

    private Author[] authors;
    private int publishedYear;

    public Book() {
        id = count++;
    }

    public Book(String title, Author[] authors, int publishedYear)
    {
        id = count++;
        this.title = title;
        this.authors = authors;
        this.publishedYear = publishedYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && publishedYear == book.publishedYear && Objects.equals(title, book.title) && Objects.deepEquals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, Arrays.hashCode(authors), publishedYear);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", authors=").append(Arrays.toString(authors));
        sb.append(", publishedYear=").append(publishedYear);
        sb.append('}');
        return sb.toString();
    }
}
