package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

public class ModernTable implements ITable {
    @Override
    public void getName() {
        System.out.println("Modern Table");
    }
}
