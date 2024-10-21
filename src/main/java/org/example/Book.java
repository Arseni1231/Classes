package org.example;

import java.util.Arrays;

public class Book {
    private String title;
    private Author[] authors;
    private int year;

    // Конструктор
    public Book(String title, Author[] authors, int year) {
        setTitle(title);
        setAuthors(authors);
        setYear(year);
    }

    // Getters и Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Название книги не может быть пустым");
        }
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        if (authors != null && authors.length > 0) {
            this.authors = authors;
        } else {
            throw new IllegalArgumentException("Книга должна иметь хотя бы одного автора");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Год должен быть положительным числом");
        }
    }

    // Метод toString
    @Override
    public String toString() {
        return "Книга: " + title + ", Авторы: " + Arrays.toString(authors) + ", Год: " + year;
    }
}

