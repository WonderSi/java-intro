package org.example;

import java.util.*;

public class ThirdTask {
    public static void result() {
        List<Human> humans = Arrays.asList(
                new Human("John", "Doe", 25),
                new Human("Alice", "Johnson", 30),
                new Human("Bob", "Smith", 22)
        );

        System.out.println();

        // a) HashSet
        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("HashSet: " + hashSet);

        // b) LinkedHashSet
        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // c) TreeSet
        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("TreeSet: " + treeSet);

        // d) TreeSet с компаратором
        Set<Human> treeSetWithComparator = new TreeSet<>(new HumanComparatorByLastName());
        treeSetWithComparator.addAll(humans);
        System.out.println("TreeSet с компаратором по фамилии: " + treeSetWithComparator);

        // e) TreeSet с анонимным компаратором по возрасту
        Set<Human> treeSetWithAnonymousComparator = new TreeSet<>(new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return Integer.compare(h1.age, h2.age);
            }
        });
        treeSetWithAnonymousComparator.addAll(humans);
        System.out.println("TreeSet с анонимным компаратором по возрасту: " + treeSetWithAnonymousComparator);

        // f)
        // HashSet не сохраняет порядок элементов, LinkedHashSet сохраняет порядок добавления,
        // TreeSet сортирует элементы по естественному порядку или заданному компаратору.
    }
}
