// made by JIBIN WILSON S7 CSE

public class ThreadSynchronizationDemo {
    static class Counter {
        private long value = 0;
        synchronized void increment() { value++; }
        synchronized long get() { return value; }
    }

    public static void main(String[] args) {
        final Counter counter = new Counter();
        int threads = 4;
        int incrementsPerThread = 250_000;

        Thread[] workers = new Thread[threads];
        for (int i = 0; i < threads; i++) {
            workers[i] = new Thread(() -> {
                for (int k = 0; k < incrementsPerThread; k++) {
                    counter.increment();
                }
            }, "Worker-" + i);
        }
        for (Thread t : workers) t.start();
        for (Thread t : workers) {
            try { t.join(); } catch (InterruptedException ignored) { }
        }

        long expected = (long) threads * incrementsPerThread;
        System.out.println("Expected: " + expected + ", Actual: " + counter.get());
    }
}


