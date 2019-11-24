package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.plants.CropRow;
import com.zipcodewilmington.froilansfarm.plants.Crop;
import com.zipcodewilmington.froilansfarm.plants.Field;


public class Tractor extends FarmVehicle{

    CropRow cropRow = new CropRow();

    @Override
     public boolean operate(Field field) {
        if (isMounted()){
          harvest(field);
            return true;
        }
        return false;
    }

    @Override
    public String makeNoise() {
        return "I'm a tractor!";
    }

    @Override
    public boolean isMounted() {
        return false;
    }
    public Crop harvest(Field field){
        for(int i = 0; i < 6; i++);
       return null;
    }
}
