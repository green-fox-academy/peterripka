package Garden;

public class GardenMain {

    public static void main(String[] args) {
        Garden highGarden = new Garden();

        plantPlants( highGarden );
        highGarden.getStatus();

        highGarden.water( 40 );
        highGarden.getStatus();

        highGarden.water( 70 );
        highGarden.getStatus();
    }

    private static void plantPlants(Garden highGarden) {
        highGarden.addPlant( new Flower( "yellow" ) );
        highGarden.addPlant( new Flower( "blue" ) );
        highGarden.addPlant( new Tree( "purple" ) );
        highGarden.addPlant( new Tree( "orange" ) );
    }
}
