package Counter;

public class CounterMain {

    public static void main(String[] args) {

        Counter ctrl = new Counter(5);

        ctrl.add();
        ctrl.add();
        ctrl.add();
        ctrl.add(10);
        ctrl.reset();

        System.out.println(ctrl.get());

    }
}
