package DesignPatterns.CreationalPatterns.FactoryMethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        //Road Logistics
        BaseLogistics roadLogistics = new RoadLogistics();
        roadLogistics.createTransport().deliver();
        roadLogistics.planDelivery();

        //Sea Logistics
        BaseLogistics seaLogistics = new SeaLogistics();
        seaLogistics.createTransport().deliver();
        seaLogistics.planDelivery();
    }
}
