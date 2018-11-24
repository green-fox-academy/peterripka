package PetrolStation;

public class PetrolStation {
    public static void main(String[] args) {


        Car trabi = new Car(0, 30);
        Car porsche = new Car(10, 60);
        Car ifa = new Car(13, 100);

        Station BP = new Station();

        System.out.println("The starting gas amount/full capacity of the cars and station are: ");
        System.out.println("Trabi: "+trabi.gasAmount+"/"+trabi.capacity);
        System.out.println("Porsche: "+porsche.gasAmount+"/"+porsche.capacity);
        System.out.println("IFA: "+ifa.gasAmount+"/"+ifa.capacity);
        System.out.println("BP station: "+BP.gasAmount);
        System.out.println();

        System.out.println("Now we try to refill the Trabi.");
        BP.refill(trabi);
        System.out.println("This is Trabi's capacity: "+trabi.capacity);
        System.out.println("This is Trabi's current gas amount: "+trabi.gasAmount);
        System.out.println("The capacity of BP after the refill: "+BP.gasAmount);

        System.out.println("Now we try to refill the Porsche.");
        BP.refill(porsche);
        System.out.println(porsche.capacity);
        System.out.println(porsche.gasAmount);
        System.out.println(BP.gasAmount);

        System.out.println("Now we try to refill the IFA.");
        BP.refill(ifa);
        System.out.println(ifa.capacity);
        System.out.println(ifa.gasAmount);
        System.out.println(BP.gasAmount);
    }
}
