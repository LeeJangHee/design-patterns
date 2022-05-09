package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._01_before.after;

public class BlackshipFactory1 implements ShipFactory1 {
    @Override
    public Ship createShip() {
        return new Blackship1();
    }
}
