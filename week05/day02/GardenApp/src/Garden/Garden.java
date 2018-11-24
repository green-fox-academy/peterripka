package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private List<Plant> plantsInGarden;

    Garden() {
        plantsInGarden = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        plantsInGarden.add( plant );
    }

    public void water(int waterAmount) {
        System.out.println( "Watering with " + waterAmount );
        int plantsNeedWater = countWaterable( this );
        double waterPerPlant = waterAmount / plantsNeedWater;
        this.waterThePlants( waterPerPlant );
    }

    private void waterThePlants(double waterPerPlant) {
        for (Plant currentPlant : this.plantsInGarden) {
            if (currentPlant.needsWater()) {
                currentPlant.watering( waterPerPlant );
            }
        }
    }

    private int countWaterable(Garden garden) {
        int counter = 0;
        for (Plant currentPlant : garden.plantsInGarden) {
            if (currentPlant.needsWater()) {
                counter++;
            }
        }
        return counter;
    }

    public void getStatus() {
        for (Plant currentPlant : plantsInGarden) {
            String needsWater;
            if (currentPlant.needsWater()) {
                needsWater = "needs water.";
            } else {
                needsWater = "doesn't need water.";
            }
            System.out.println( "The " + currentPlant.getColor() + " " + currentPlant.getType() + " " +
                    needsWater );
        }
        System.out.println();
    }
}
