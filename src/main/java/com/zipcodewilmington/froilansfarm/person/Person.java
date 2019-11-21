package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.food.Eater;
import com.zipcodewilmington.froilansfarm.food.Edible;

import java.util.List;

public abstract class Person  implements NoiseMaker, Eater, Rider {

    String name;
    int foodEaten;

    public Person() {
    }


    public void eat(Edible edible){

        if(!edible.wasEaten()) {
            edible.makeEaten();
            foodEaten++;
        }
    }

    public int getFoodEaten(){
        return foodEaten;
    }

    public String makeNoise(String speak) {
        return "Hey! there ";
    }


}
