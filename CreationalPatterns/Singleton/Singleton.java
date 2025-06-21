package DesignPatterns.CreationalPatterns.Singleton;

public class Singleton {
    private static Singleton instance;
    private String value;

    private Singleton(String value) {
        this.value = value;
        System.out.println("Singleton has been initialised");
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }

    public String getValue() {
        return this.value;
    }
}
