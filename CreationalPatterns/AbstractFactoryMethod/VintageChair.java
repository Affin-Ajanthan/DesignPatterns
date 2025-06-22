package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

public class VintageChair implements IChair{
    @Override
    public void getName() {
        System.out.println("Vintage Chair");
    }
}
