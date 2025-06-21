package DesignPatterns.CreationalPatterns.FactoryMethod;

public class Ship implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Deliver by sea");
    }
}
