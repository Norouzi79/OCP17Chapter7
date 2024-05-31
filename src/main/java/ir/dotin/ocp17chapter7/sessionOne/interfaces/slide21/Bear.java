package ir.dotin.ocp17chapter7.sessionOne.interfaces.slide21;

/**
 * Java supports inheriting two abstract methods that have compatible method declarations.
 */
public class Bear implements Herbivore, Omnivore {
    @Override
    public void eatPlats() {
        System.out.println("Eating plants");
    }
}
