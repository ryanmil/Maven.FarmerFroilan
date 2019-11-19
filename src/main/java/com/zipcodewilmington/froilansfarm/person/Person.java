package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.food.Eater;

public abstract class Person  implements NoiseMaker, Eater, Rider {
    public String makeNoise(String speak) {
        return null;
    }
    String name;

}
