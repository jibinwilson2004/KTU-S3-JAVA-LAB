// made by JIBIN WILSON S7 CSE
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MultiThreadEvenOddSquaresCubes {
    public static void main(String[] args) {
        BlockingQueue<Integer> evenQueue = new ArrayBlockingQueue<>(10);
        BlockingQueue<Integer> oddQueue = new ArrayBlockingQueue<>(10);

        Thread producer = new Thread(() -> {
            Random rand = new Random();
            try {
                while (true) {
                    int value = rand.nextInt(100); // 0..99
                    System.out.println("Generated: " + value);
                    if (value % 2 == 0) {
                        evenQueue.put(value);
                    } else {
                        oddQueue.put(value);
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ignored) { }
        }, "Producer");

        Thread squareConsumer = new Thread(() -> {
            try {
                while (true) {
                    int v = evenQueue.take();
                    System.out.println("Square of " + v + " = " + (v * v));
                }
            } catch (InterruptedException ignored) { }
        }, "SquareConsumer");

        Thread cubeConsumer = new Thread(() -> {
            try {
                while (true) {
                    int v = oddQueue.take();
                    System.out.println("Cube of " + v + " = " + (v * v * v));
                }
            } catch (InterruptedException ignored) { }
        }, "CubeConsumer");

        producer.setDaemon(true);
        squareConsumer.setDaemon(true);
        cubeConsumer.setDaemon(true);

        producer.start();
        squareConsumer.start();
        cubeConsumer.start();

        try {
            Thread.sleep(10000); // run for 10 seconds
        } catch (InterruptedException ignored) { }
        System.out.println("Demo finished.");
    }
}


