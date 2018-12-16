package day10;

public class CheckResult {



    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread( () -> {
            for (int i = 0; i<500; i++){
                CheckResult.counter++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        for (int j = 0; j < counter; j++){
            System.out.println("In loop test");
        }

        Thread.sleep(1000);

        System.out.println("End test " + counter);
    }
}