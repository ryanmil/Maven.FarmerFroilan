package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.miscinterfaces.Rideable;
import com.zipcodewilmington.froilansfarm.plants.CropRow;
import com.zipcodewilmington.froilansfarm.person.Person;

public class Pilot extends Person {
    Person thePilot;

    public Pilot(Person thePilot) {
        this.thePilot = thePilot;
    }

    public void fly (Aircraft aircraft){

            aircraft.isFlying();


    }

    public void land(Pilot pilot){

    }


    public void pilotAircraft(CropRow row, Aircraft aircraft) {

       // aircraft.fly(row, this);


    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void unmount(Rideable rideable) {

    }
}
