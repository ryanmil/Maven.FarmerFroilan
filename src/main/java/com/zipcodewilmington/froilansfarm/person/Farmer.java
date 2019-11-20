package com.zipcodewilmington.froilansfarm.person;
import com.zipcodewilmington.froilansfarm.food.Edible;

public class Farmer extends Person {

    String name;


    public Farmer(String name){
        super();

        this.name = name;
    }


    public void Eat(Edible food) {


    }

    public String makeNoise() {

        return "ahhhhhhhh!";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
