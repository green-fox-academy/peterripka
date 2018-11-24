package Garden;

public class Plant {

    private String color;
    private double humidityLevel;
    private String type;

    Plant(String color) {
        this.color = color;
        humidityLevel = 0;
    }

    public boolean needsWater() {
        if (this instanceof Tree) {
            return (this.getHumidityLevel() < 10);
        } else {
            return (this.getHumidityLevel() < 5);
        }
    }

    public void watering(double waterAmount) {
        if (this instanceof Tree) {
            ((Tree) this).water( waterAmount );
        } else {
            ((Flower) this).water( waterAmount );
        }
    }

    void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;

    }

    public String getColor() {
        return color;
    }

    double getHumidityLevel() {
        return humidityLevel;
    }

    void setHumidityLevel(double humidityLevel) {
        this.humidityLevel = humidityLevel;
    }
}

