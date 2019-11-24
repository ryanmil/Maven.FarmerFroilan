package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.miscinterfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.miscinterfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {
    Boolean isMounted;
    public Vehicle(Boolean isMounted){
        this.isMounted = isMounted;
    }
    public boolean isMounted(){
        return isMounted;
    }
}
