package Animal;

public class AnimalMain {

    public static void main(String[] args) {

        Animal monkey = new Animal("monkey",45,33);
        monkey.play();
        monkey.play();
        monkey.eat();

        Animal lion = new Animal("lion",30, 45);
        lion.eat();
        lion.play();
        lion.play();
        lion.play();
        lion.drink();

        System.out.println("Hunger value of "+ monkey.name+" is: "+monkey.hunger+", while the thirst value is: "+monkey.thirst);
        System.out.println(lion);
    }
}
