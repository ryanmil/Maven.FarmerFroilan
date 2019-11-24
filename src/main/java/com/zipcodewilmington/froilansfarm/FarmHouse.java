package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.Egg;
import com.zipcodewilmington.froilansfarm.food.Tomato;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {

    List<Edible> ediblePantry = new ArrayList<>();
    List<Corn> cornPantry = new ArrayList<>();
    List<Tomato> tomatoPantry = new ArrayList<>();
    List<Egg> eggPantry = new ArrayList<>();

    public void store(Corn corn){
        cornPantry.add(corn);
    }
    public void store(Tomato tomato) {
        tomatoPantry.add(tomato);
    }
    public void store(Egg egg) {
        eggPantry.add(egg);
    }

    public void store(Edible edible){
        ediblePantry.add(edible);
    }
}
