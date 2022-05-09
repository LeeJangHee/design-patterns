package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._01_before.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory1(), "Whiteship", "janghee@gmail.com");
        client.print(new WhiteshipFactory1(), "Blackship", "janghee@mail.com");

    }

    private void print(ShipFactory1 shipFactory1, String name, String email) {
        System.out.println(shipFactory1.orderShip(name, email));
    }

}
