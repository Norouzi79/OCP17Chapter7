package ir.dotin.ocp17chapter7.sessionOne.interfaces.slide18;

/**
 * Interfaces can inherit from each other
 * if we implement HasBigEyes we have to implement methods in
 * Nocturnal and CanFly too
 */
public interface HasBigEyes extends Nocturnal, CanFly {
}
