package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.food.Eater;
import com.zipcodewilmington.froilansfarm.food.Edible;

import java.util.List;

public abstract class Person  implements NoiseMaker, Eater, Rider {

    public Person() {
    }


    public void eat(Edible edible){

    }

    public String makeNoise(String speak) {
        return "Hey! there ";
    }
    String name;

}
