package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

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

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();
        List<Visitor> visitors = gson.fromJson(new FileReader("src/main/resources/books.json"), new TypeToken<List<Visitor>>() {
        }.getType());

        //1
        System.out.println("Посетители:");
        visitors.forEach(v -> System.out.println(v.getName() + " " + v.getSurname()));
        System.out.println("Количество посетителей: " + visitors.size());

        //2
        long uniqueBooksCount = visitors.stream().flatMap(v -> v.getFavoriteBooks().stream()).distinct().count();
        System.out.println("Количество уникальных книг в избранном: " + uniqueBooksCount);
    }
}