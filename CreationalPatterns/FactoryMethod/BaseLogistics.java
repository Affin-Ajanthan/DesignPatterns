package DesignPatterns.CreationalPatterns.FactoryMethod;

public abstract class BaseLogistics {
    public void planDelivery() {
        System.out.println("Plan Delivery");
    }

    public abstract ITransport createTransport();
}
