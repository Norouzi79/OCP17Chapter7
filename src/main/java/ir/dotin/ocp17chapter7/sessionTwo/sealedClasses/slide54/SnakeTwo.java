package ir.dotin.ocp17chapter7.sessionTwo.sealedClasses.slide54;

public sealed class SnakeTwo permits SnakeTwo.Cobra {
    final class Cobra extends SnakeTwo{}
}
