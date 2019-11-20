package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.food.Edible;

public class Horse extends Animal implements Rideable {

    public String makeNoise() {

        return null;
    }

    public void mount(Rider rider) {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount(){

    }

    @Override
    public void eat(Edible food) {

    }
}
