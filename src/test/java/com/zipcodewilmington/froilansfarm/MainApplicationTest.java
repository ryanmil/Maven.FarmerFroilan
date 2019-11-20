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
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 2/26/18.
 */

public class MainApplicationTest {
    @Before
    public void setup() {
        //Instantiation
        // Farm farm = new Farm();
        Field field = new Field();
        CropRow cropRow = new CropRow();
        CornPlant cornPlant = new CornPlant();
        TomatoPlant tomatoPlant = new TomatoPlant();
        Horse horse = new Horse();
        Chicken chicken = new Chicken();
        Farmer froilan = new Farmer("Froilan");
        Farmer froilanda = new Farmer("Froilanda");
        Corn corn = new Corn();
        Egg egg = new Egg();
        Tomato tomato = new Tomato();
        CropDuster cropDuster = new CropDuster();
        
        cropRow.crops.add(cornPlant);
        field.rows.add();
    }

    @Test
    public void SundayTest() {

        
    }
}

