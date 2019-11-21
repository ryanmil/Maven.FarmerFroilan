package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.person.Person;

public class Pilot  {
    Person thePilot;

    public Pilot(Person thePilot) {
        this.thePilot = thePilot;
    }

    public void fly (Aircraft aircraft){
            isFlying();

    }

    public void land(Pilot pilot){

    }

    public void pilotAircraft(CropRow row, Aircraft aircraft) {

        aircraft.fly(row, this);


    }
}
