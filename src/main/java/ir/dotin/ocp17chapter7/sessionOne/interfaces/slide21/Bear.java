package ir.dotin.ocp17chapter7.sessionOne.interfaces.slide21;

public class Bear implements Herbivore, Omnivore {
    @Override
    public void eatPlats() {
        System.out.println("Eating plants");
    }
}
