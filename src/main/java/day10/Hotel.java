package day10;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Hotel implements Executor {

    @Override
    public void execute(Runnable command) {
        command.run();
    }

    public static void main(String[] args) throws InterruptedException {
        Hotel hotel = new Hotel();

        hotel.execute(new Order("tea"));
        hotel.execute(new Order("cofee"));
        hotel.execute(new Order("soup"));

        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(new Order("tea with milk"));
        pool.execute(new Order("tea with cofee"));

        Thread.sleep(2000);

        pool.execute(new Order("only milk"));
        pool.shutdown();
    }
}