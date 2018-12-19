package day2;

public interface Double {
    void say();

    default void sayHello(String name){
        System.out.println("Buy " + name);
    }



    static void sayHello2(String name){
        System.out.println("Buy " + name);
    }
}
