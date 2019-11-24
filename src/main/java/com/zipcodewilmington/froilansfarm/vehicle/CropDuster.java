package com.zipcodewilmington.froilansfarm.vehicle;
import com.zipcodewilmington.froilansfarm.miscinterfaces.Rider;
import com.zipcodewilmington.froilansfarm.plants.CropRow;
import com.zipcodewilmington.froilansfarm.plants.Field;

public class CropDuster extends FarmVehicle implements Aircraft {

    public CropDuster(Boolean isMounted, Rider rider) {
        super(isMounted, rider);
    }

    @Override
    public String makeNoise() {
        return "Look I'm in the sky!";
    }

    @Override
    boolean operate(Field field) {
      if (isFlying() && rider instanceof Pilot) {
          //fertalize that field
          return true;
      }
        return false;
    }

    @Override
    public boolean isFlying() {
        return true;
    }
    private void fertilize(Field field) {
        for (int i = 0; i < field.getNumOfRows(); i++) {
            CropRow row = field.getRow(i);
            for (int j = 0; j < row.getNumOfCrops(); j++) {
                row.getCrop(j).setHasBeenFertilized(true);
            }

        }
    }
}
