package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

public class FactoryVintage implements AbstractFactory {
    @Override
    public IChair getChair() {
        return new VintageChair();
    }

    @Override
    public ITable getTable() {
        return new VintageTable();
    }
}
