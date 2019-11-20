package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.food.Eater;

public abstract class Animal implements Eater, NoiseMaker {

    public abstract void mount(Rideable rideable);

    public abstract void dismount();


    public Integer amountOfFoodEaten(){
        return null;
    }


}
