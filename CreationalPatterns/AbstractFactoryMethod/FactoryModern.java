package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

public class FactoryModern implements AbstractFactory {
    @Override
    public IChair getChair() {
        return new ModernChair();
    }

    @Override
    public ITable getTable() {
        return new ModernTable();
    }
}
