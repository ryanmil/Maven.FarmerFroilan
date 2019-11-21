package com.zipcodewilmington.froilansfarm.vehicle;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.plants.Crop;

public class CropDuster extends FarmVehicle implements Aircraft {

    @Override
    public String makeNoise() {
        return "Look I'm in the sky!";
    }

    @Override
    public void mount(Rider rider) {
        this.rider = rider;
    }

    @Override
    public void fly (Crop crop, Rider rider){
       // if(rider.isPilot)
        crop.hasBeenFertilized();
    }

    @Override
    void operate(Farm farm) {
        //fly();
    }
}
