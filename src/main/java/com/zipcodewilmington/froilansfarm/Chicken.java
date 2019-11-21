package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.food.Edible;

public class Chicken implements Producer {

    @Override
    public Edible yield() {
        return null;
    }

    @Override
    public boolean hasBeenFertilized() {
        return false;
    }

    @Override
    public boolean hasBeenHarvested() {
        return false;
    }

}
