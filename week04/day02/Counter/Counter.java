package Counter;

public class Counter {
    int value = 0;
    int initValue;

    
    public Counter(int value) {
        this.value = value;
        this.initValue = value;
    }

    public Counter() {
        this.initValue = value;
    }

    public void add() {
        this.value++;
    }

    public void add(int adder) {
        this.value += adder;
    }

    public int get() {
        return value;
    }

    public void reset() {
        this.value = this.initValue;
    }
}
