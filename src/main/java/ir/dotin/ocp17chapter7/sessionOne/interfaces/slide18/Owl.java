package ir.dotin.ocp17chapter7.sessionOne.interfaces.slide18;

public class Owl implements HasBigEyes {
    @Override
    public void flap() {
        System.out.println("Flap!");
    }

    @Override
    public int hunt() {
        return 5;
    }
}
