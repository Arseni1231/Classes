package org.example;

public class Main {

        public static void main(String[] args) {
            Author author1 = new Author("Лев", "Толстой");
            Author author2 = new Author("Фёдор", "Достоевский");
            Author author3 = new Author("Антон", "Чехов");
            Author author4 = new Author("Иван Тургенев", "Тургенев");
            Author author5 = new Author("Александр Пушкин", "Пушкин");

            Book[] books = new Book[5];

            books[0] = new Book("Война и мир", new Author[]{author1}, 1869);
            books[1] = new Book("Преступление и наказание", new Author[]{author2}, 1866);
            books[2] = new Book("Чайка", new Author[]{author3}, 1970);
            books[3] = new Book("Отцы и дети", new Author[]{author4}, 1861);
            books[4] = new Book("Евгений Онегин", new Author[]{author5}, 1831);

            for (Book book : books) {
                System.out.println(book);
            }
        }
    }


