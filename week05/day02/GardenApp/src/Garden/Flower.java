package Garden;

public class Flower extends Plant {

    private static final double waterAbsorbRatio = 0.75;

    Flower(String color) {
        super( color );
        this.setType( "Flower" );
    }

    public void water(double waterAmount) {
        this.setHumidityLevel( this.getHumidityLevel() + waterAmount * waterAbsorbRatio );
    }
}