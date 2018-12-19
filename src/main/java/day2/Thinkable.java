package day2;

public interface Thinkable {
    void say();

    default void sayHello(String name){
        System.out.println("Hello " + name);
    }
}