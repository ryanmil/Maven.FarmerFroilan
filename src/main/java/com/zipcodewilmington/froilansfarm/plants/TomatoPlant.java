package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.Tomato;

public class TomatoPlant extends Crop {


    public Edible yield() {
        if(this.hasBeenFertilized()) {
            this.setHasBeenHarvested(true);
            return new Tomato();
        }

        return null;
    }
}

