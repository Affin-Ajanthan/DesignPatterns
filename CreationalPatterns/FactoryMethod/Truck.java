package DesignPatterns.CreationalPatterns.FactoryMethod;

public class Truck implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Deliver by road");
    }
}
