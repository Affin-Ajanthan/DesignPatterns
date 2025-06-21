package DesignPatterns.CreationalPatterns.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("Test 1");
        System.out.println("value 1 : " + singleton1.getValue());
        Singleton singleton2 = Singleton.getInstance("Test 2");
        System.out.println("value 2 : " + singleton2.getValue());
    }
}
