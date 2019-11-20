package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.food.Edible;

public class CornPlant extends Crop {

    public Edible yield() {

        if(this.hasBeenFertilized()) {
            this.setHasBeenHarvested(true);
            return new Corn();
        }

        return null;
    }
}
