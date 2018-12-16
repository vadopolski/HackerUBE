package day2.composition;

public class Main {

    public static void main(String[] args) {
        // Composition example
        Cat tom = new Cat("Tom");

        Home home = new Home(tom);

        home.printHomeName();
    }
}