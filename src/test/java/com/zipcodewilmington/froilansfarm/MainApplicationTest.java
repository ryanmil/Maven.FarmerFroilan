package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.food.Egg;
import com.zipcodewilmington.froilansfarm.food.Tomato;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Person;
import com.zipcodewilmington.froilansfarm.plants.CornPlant;
import com.zipcodewilmington.froilansfarm.plants.Crop;
import com.zipcodewilmington.froilansfarm.plants.TomatoPlant;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.animal.AnimalHouse;
import com.zipcodewilmington.froilansfarm.vehicle.FarmVehicle;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 2/26/18.
 */

public class MainApplicationTest {
    //Instantiation
    // Farm farm = new Farm();
    Field field = new Field();
    CropRow cornRow = new CropRow();
    CropRow tomatoRow = new CropRow();
    CropRow cornRow1 = new CropRow();
    CropRow cornRow2 = new CropRow();
    CropRow tomatoRow1 = new CropRow();
    CornPlant cornPlant = new CornPlant();
    TomatoPlant tomatoPlant = new TomatoPlant();
    Farmer froilan = new Farmer("Froilan");
    Farmer froilanda = new Farmer("Froilanda");
    Corn corn = new Corn();
    Egg egg = new Egg();
    Tomato tomato = new Tomato();


    //4 chicken Coops with 15 chickens spread out
    AnimalHouse<Chicken> chickenCoop0 = new AnimalHouse<Chicken>();
    AnimalHouse<Chicken> chickenCoop1 = new AnimalHouse<Chicken>();
    AnimalHouse<Chicken> chickenCoop2 = new AnimalHouse<Chicken>();
    AnimalHouse<Chicken> chickenCoop3 = new AnimalHouse<Chicken>();

    //3 stables with 10 Horses spread out
    AnimalHouse<Horse> stable0 = new AnimalHouse<>();
    AnimalHouse<Horse> stable1 = new AnimalHouse<>();
    AnimalHouse<Horse> stable2 = new AnimalHouse<>();


    @Before
    public void setup() {


        for (int i = 0; i <= 2; i++){
            chickenCoop0.add(new Chicken());
            chickenCoop1.add(new Chicken());
            chickenCoop2.add(new Chicken());
            chickenCoop3.add(new Chicken());

        }
        chickenCoop0.add(new Chicken());
        chickenCoop0.add(new Chicken());
        chickenCoop0.add(new Chicken());



        for (int i = 0; i < 2; i++){
            stable0.add(new Horse());
            stable1.add(new Horse());
            stable2.add(new Horse());
        }
        stable0.add(new Horse());

        //2 farm Vehicles and an aircraft
        FarmVehicle tractor1 = new Tractor();
        FarmVehicle tractor2 = new Tractor();
        FarmVehicle cropDuster = new CropDuster();



/*
waiting for the plants to be functional
        //adding the plants to the cropRows
        tomatoRow.crops.add(tomatoPlant);
        cornRow.crops.add(cornPlant);
        tomatoRow1.crops.add(tomatoPlant);
        cornRow1.crops.add(cornPlant);
        cornRow2.crops.add(cornPlant);

        //adding the cropRows to the field
        field.rows.add(cornRow);
        field.rows.add(tomatoRow);
        field.rows.add(cornRow1);
        field.rows.add(tomatoRow1);
        field.rows.add(cornRow2);

*/



    }

    @Test
    public void SundayTest() {
        //Every morning, Froilan and Froilanda begin their morning by

        //Riding each Horse in each Stable


    }
}

