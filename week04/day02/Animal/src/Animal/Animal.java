package Animal;

public class Animal {
    String name;
    int hunger = 50;
    int thirst = 50;

    public Animal(String name, int hunger, int thirst) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
    }
    public void eat(){
        hunger--;
    }
    public void drink(){
        thirst--;
    }
    public void play() {
        hunger++;
        thirst++;
    }

    @Override
    public String toString() {
        return "Hunger value of "+ this.name+" is: "+this.hunger+", while the thirst value is: "+this.thirst;
    }
}
