package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

public class VintageTable implements ITable {
    @Override
    public void getName() {
        System.out.println("Vintage Table");
    }
}
