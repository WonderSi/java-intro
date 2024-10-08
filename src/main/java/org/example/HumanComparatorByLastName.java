package org.example;

import java.util.Comparator;

class HumanComparatorByLastName implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h1.lastName.compareTo(h2.lastName);
    }
}
