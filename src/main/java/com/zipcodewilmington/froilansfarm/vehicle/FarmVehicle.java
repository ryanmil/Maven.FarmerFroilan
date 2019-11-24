package com.zipcodewilmington.froilansfarm.vehicle;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.plants.Field;
import com.zipcodewilmington.froilansfarm.miscinterfaces.Rider;

public abstract class FarmVehicle extends Vehicle {
    Farm farm;
    Rider rider;

    public FarmVehicle(Boolean isMounted, Rider rider) {
        super(isMounted);
        this.rider = rider;
    }

    abstract boolean operate(Field field);

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }
}
