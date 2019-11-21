package com.zipcodewilmington.froilansfarm.vehicle;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.Rider;

public abstract class FarmVehicle extends Vehicle {
    Farm farm;
    Rider rider;

   abstract boolean operate(Field field);
}
