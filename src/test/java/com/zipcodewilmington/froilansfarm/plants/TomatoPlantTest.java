package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.person.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoPlantTest {

    Farmer froilan;
    TomatoPlant tomatoPlant;

    @Test
    public void constructorTest(){

        tomatoPlant = new TomatoPlant();

        Assert.assertFalse(tomatoPlant.hasBeenFertilized());
        Assert.assertFalse(tomatoPlant.hasBeenHarvested());
    }

    @Test
    public void harvestTest(){

        tomatoPlant = new TomatoPlant();

        tomatoPlant.setHasBeenHarvested(true);

        Assert.assertTrue(tomatoPlant.hasBeenHarvested());

    }


}