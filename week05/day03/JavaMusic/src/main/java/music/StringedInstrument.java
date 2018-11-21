package main.java.music;

public abstract class StringedInstrument extends Instrument {
    protected int numberOfStrings;

    public StringedInstrument(String name, int numberOfStrings) {
        super( name );
        this.numberOfStrings = numberOfStrings;
    }

    public StringedInstrument() {

    }

    public abstract String sound();

    public void play() {
        System.out.println( this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " +
                this.sound() );
    }
}