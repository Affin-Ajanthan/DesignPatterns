package DesignPatterns.CreationalPatterns.FactoryMethod;

public class RoadLogistics extends BaseLogistics {
    @Override
    public ITransport createTransport() {
        return new Truck();
    }
}
