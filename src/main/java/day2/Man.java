package day2;

public class Man implements Thinkable, Double {
    @Override
    public void say() {
        System.out.println("Hello");
    }

    @Override
    public void sayHello(String name) {
        Double.super.sayHello(name);

    }
}
