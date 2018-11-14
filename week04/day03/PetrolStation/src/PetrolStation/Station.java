package PetrolStation;

public class Station {

    int gasAmount;

    public Station() {
        gasAmount = 10000;
    }

    public void refill(Car car) {
        gasAmount -= (car.capacity-car.gasAmount);
        car.gasAmount += (car.capacity-car.gasAmount);
    }
}
