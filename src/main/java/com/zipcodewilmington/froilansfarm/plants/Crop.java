package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.Producer;
import com.zipcodewilmington.froilansfarm.food.Edible;

public abstract class Crop implements Producer {

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;
    int count = 0;

    public void Crop(){

        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    public abstract Edible yield();

    public boolean hasBeenFertilized(){

        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized){

        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean hasBeenHarvested(){

        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested){
        this.hasBeenHarvested = hasBeenHarvested;

    }
}
