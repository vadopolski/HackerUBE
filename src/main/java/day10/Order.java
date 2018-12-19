package day10;

public class Order implements Runnable {
    String name;

    public Order(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);

        for (int i = 1; i < 10; i++) {
            System.out.println(i % 2 == 0 ? "Hello" : "Bye");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}