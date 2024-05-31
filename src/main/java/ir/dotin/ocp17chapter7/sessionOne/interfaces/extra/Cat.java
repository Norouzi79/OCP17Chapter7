package ir.dotin.ocp17chapter7.sessionOne.interfaces.extra;

/**
 * How to declare the version we want, if the Cat class wanted to access the version of getSpeed() in
 * Walk or Run?
 */
public class Cat implements Walk, Run{
    // We have overridden the default method here
    public int getSpeed() {
        return 1;
    }

    public int getWalkSpeed() {
        return Walk.super.getSpeed();
    }
}
