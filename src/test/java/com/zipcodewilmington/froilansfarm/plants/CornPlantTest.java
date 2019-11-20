package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.person.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornPlantTest {

    CornPlant cornPlant;

    @Test
    public void constructorTest(){

        cornPlant = new CornPlant();

        Assert.assertFalse(cornPlant.hasBeenFertilized());
        Assert.assertFalse(cornPlant.hasBeenHarvested());
    }

    @Test
    public void fertilized(){

        cornPlant = new CornPlant();

        cornPlant.setHasBeenFertilized(true);

        Assert.assertTrue(cornPlant.hasBeenFertilized());
    }

}