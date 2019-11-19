package com.zipcodewilmington.froilansfarm.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalHouse<T extends Animal> {

    private List<T> animals;

    public AnimalHouse() {
        animals = new ArrayList<T>();
    }

    public T get(Integer index) {
        return animals.get(index);
    }

    public void add(T animal) {
        animals.add(animal);
    }
}
