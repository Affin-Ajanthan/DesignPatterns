package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

public class AbstractFactoryMethodTest {
    public static void main(String[] args) {
        // Modern Factory
        AbstractFactory modernFactory = new FactoryModern();
        modernFactory.getChair().getName();
        modernFactory.getTable().getName();

        //Vintage Factory
        AbstractFactory vintageFactory = new FactoryVintage();
        vintageFactory.getChair().getName();
        vintageFactory.getTable().getName();
    }
}
