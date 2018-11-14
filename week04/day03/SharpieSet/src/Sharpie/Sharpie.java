package Sharpie;

public class Sharpie {
    String color;
    double width;
    double inkAmount = 100;

    @Override
    public String toString() {
        return "Sharpie{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", inkAmount=" + inkAmount +
                '}';
    }

    public Sharpie(String color, double width, double inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public void use() {
        inkAmount--;
    }

    public void useAllInk() {
        inkAmount = 0;
    }


    public double getInkAmount() {
        return inkAmount;
    }
}

