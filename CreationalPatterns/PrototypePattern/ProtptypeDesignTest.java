package DesignPatterns.CreationalPatterns.PrototypePattern;

public class ProtptypeDesignTest {
    public static void main(String[] args) {
        IBook original = new Book("Design Patterns", "Affin");
        //clone() method will give the prototype of the original object
        IBook copy = original.clone();

        System.out.println(copy.getAuthor());
        System.out.println(original.getAuthor());

    }
}
