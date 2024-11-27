package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
class Book {
    private String name;
    private String author;
    private int publishingYear;
    private String isbn;
    private String publisher;
}

@Data
class Visitor {
    private String name;
    private String surname;
    private String phone;
    private boolean subscribed;
    private List<Book> favoriteBooks;
}

@Data
class Sms {
    private String phone;
    private String message;

    public Sms(String phone, String message) {
        this.phone = phone;
        this.message = message;
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //**********************************************************************************
        // Загрузка файла
        //**********************************************************************************

        Gson gson = new Gson();
        List<Visitor> visitors = gson.fromJson(new FileReader("src/main/resources/books.json"), new TypeToken<List<Visitor>>() {
        }.getType());

        //**********************************************************************************
        // Задание 1
        //**********************************************************************************

        System.out.println("\nЗадание 1");
        System.out.println("Посетители:");
        visitors.forEach(v -> System.out.println(v.getName() + " " + v.getSurname()));
        System.out.println("Количество посетителей: " + visitors.size());

        //**********************************************************************************
        // Задание 2
        //**********************************************************************************
        System.out.println("\nЗадание 2");
        Set<Book> uniqueBooks = visitors.stream()
                .flatMap(visitor -> visitor.getFavoriteBooks().stream())
                .collect(Collectors.toSet());
        System.out.println("\nСписок уникальных книг: ");
        uniqueBooks.forEach(book -> System.out.println(book.getName() + " by " + book.getAuthor()));
        System.out.println("Кол-во уникальных книг: " + uniqueBooks.size());

        //**********************************************************************************
        // Задание 3
        //**********************************************************************************

        System.out.println("\nЗадание 3");
        List<Book> sortedBooks = uniqueBooks.stream()
                .sorted(Comparator.comparingInt(Book::getPublishingYear))
                .toList();
        System.out.println("Список книг (отсортированных по году издания): ");
        sortedBooks.forEach(book -> System.out.println(book.getName() + " (" + book.getPublishingYear() + ")"));

        //**********************************************************************************
        // Задание 4
        //**********************************************************************************

        System.out.println("\nЗадание 4");
//        boolean hasJaneAusten1 = visitors.stream()
//                .flatMap(v -> v.getFavoriteBooks().stream())
//                .anyMatch(b -> "Jane Austen".equals(b.getAuthor()));
//        System.out.println("Jane Austen в избранном: " + hasJaneAusten1);

        visitors.forEach(v -> {
            boolean hasJaneAusten2 = v.getFavoriteBooks().stream()
                    .anyMatch(book -> "Jane Austen".equals(book.getAuthor()));
            System.out.println("У " + v.getName() + " " + v.getSurname() +
                    " в избранном есть книга автора Jane Austen: " + hasJaneAusten2);
        });

        //**********************************************************************************
        // Задание 5
        //**********************************************************************************

        System.out.println("\nЗадание 5");
        int maxFavoriteBooks = visitors.stream()
                .mapToInt(v -> v.getFavoriteBooks().size())
                .max()
                .orElse(0);
        System.out.println("Максимальное число добавленных в избранное книг: " + maxFavoriteBooks);

        //**********************************************************************************
        // Задание 6
        //**********************************************************************************

        System.out.println("\nЗадание 6");
        double averageFavorites = visitors.stream()
                .mapToInt(visitor -> visitor.getFavoriteBooks().size())
                .average()
                .orElse(0);

        List<Sms> smsMessages = visitors.stream().filter(Visitor::isSubscribed).map(v -> {
            int favoriteCount = v.getFavoriteBooks().size();
            String message = favoriteCount > averageFavorites ? "you are a bookworm" : favoriteCount < averageFavorites ? "read more" : "fine";
            return new Sms(v.getPhone(), message);
        }).toList();

        System.out.println("SMS сообщения: ");
        smsMessages.forEach(sms -> System.out.println(sms.getPhone()+ ": " + sms.getMessage()));
    }
}
