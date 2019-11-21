package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.food.Edible;

public class Horse extends Animal implements Rideable{
    Rider rider;
    Rideable rideable;

    public String makeNoise() {
        return "Neighhh!";
    }

    public void mount(Rider rider) {
        this.rideable.mount(rider);
    }

    public void dismount(){
        this.rider = null;
    }

    public void eat(Edible food) {
        food.makeEaten();
    }

}
