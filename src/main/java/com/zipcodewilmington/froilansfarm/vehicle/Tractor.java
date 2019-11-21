package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.plants.CornPlant;
import com.zipcodewilmington.froilansfarm.plants.Crop;
import com.zipcodewilmington.froilansfarm.plants.TomatoPlant;

import java.util.ArrayList;

public class Tractor extends FarmVehicle{

    CropRow cropRow = new CropRow();

    @Override
    void operate(Farm farm) {

    }

    @Override
    public String makeNoise() {
        return "I'm a tractor!";
    }

    public void plantCrop (Crop crop){

        cropRow.addCrop(crop);

    }

    @Override
    public boolean isMounted() {
        return false;
    }
}
