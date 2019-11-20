package com.zipcodewilmington.froilansfarm.person;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.plants.Crop;

public class Farmer extends Person {
    String name;


    public Farmer(String name){
        super();
        this.name = name;
    }

    public void Eat(Edible food) {

    }

    public String makeNoise() {

        return "ahhhhhhhh!";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoodEaten(){
        return foodEaten;
    }

    public void plant(Crop crop, CropRow row){

    }

    public void fertilize(Crop crop){

        crop.setHasBeenFertilized(true);
    }

}
