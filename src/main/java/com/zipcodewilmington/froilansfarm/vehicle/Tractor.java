package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.FarmHouse;
import com.zipcodewilmington.froilansfarm.miscinterfaces.Rider;
import com.zipcodewilmington.froilansfarm.plants.CropRow;
import com.zipcodewilmington.froilansfarm.plants.Field;


public class Tractor extends FarmVehicle{
    private FarmHouse farmHouse;

    public Tractor(Boolean isMounted, Rider rider, FarmHouse farmHouse) {
        super(isMounted, rider);
        this.farmHouse = farmHouse;
    }

    @Override
     public boolean operate(Field field) {
        if (isMounted() && rider != null){
          harvest(field, farmHouse);
            return true;
        }
        return false;
    }

    @Override
    public String makeNoise() {
        return "I'm a tractor!";
    }

    private void harvest(Field field, FarmHouse farmHouse){
        for(int i = 0; i < field.getNumOfRows(); i++){
            CropRow row = field.getRow(i);
            for(int j = 0; j < row.getNumOfCrops(); j++) {
                farmHouse.store(row.getCrop(j).yield());
            }
        }
    }
}
