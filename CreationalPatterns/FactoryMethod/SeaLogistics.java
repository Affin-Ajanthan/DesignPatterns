package DesignPatterns.CreationalPatterns.FactoryMethod;

public class SeaLogistics extends BaseLogistics {
    @Override
    public ITransport createTransport() {
        return new Ship();
    }
}
