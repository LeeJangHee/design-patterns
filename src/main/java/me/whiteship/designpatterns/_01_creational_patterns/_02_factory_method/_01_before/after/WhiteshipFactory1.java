package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._01_before.after;

public class WhiteshipFactory1 implements ShipFactory1 {


    @Override
    public Ship createShip() {
        return new Whiteship1();
    }
}
