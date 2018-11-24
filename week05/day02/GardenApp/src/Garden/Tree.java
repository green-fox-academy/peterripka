package Garden;

public class Tree extends Plant {

    private static final double waterAbsorbRatio = 0.4;

    Tree(String color) {
        super( color );
        this.setType( "Tree" );
    }

    public void water(double waterAmount) {
        this.setHumidityLevel( this.getHumidityLevel() + waterAmount * waterAbsorbRatio );
    }
}

