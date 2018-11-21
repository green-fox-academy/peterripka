package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        super( "Bass Guitar", 4 );
    }

    public BassGuitar(int numberOfStrings) {
        this.name = "Bass Guitar";
        this.numberOfStrings = numberOfStrings;

    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}
