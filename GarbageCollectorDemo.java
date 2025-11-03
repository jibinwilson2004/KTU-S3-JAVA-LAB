// made by JIBIN WILSON S7 CSE

public class GarbageCollectorDemo {
    static class DemoObject {
        private final int id;
        DemoObject(int id) { this.id = id; }
        @Override
        protected void finalize() throws Throwable { // Note: finalize is deprecated in newer Java
            System.out.println("DemoObject " + id + " is being garbage collected");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            DemoObject obj = new DemoObject(i);
            // Lose reference
        }
        System.out.println("Requesting garbage collection...");
        System.gc();
        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
        System.out.println("End of demo. (Finalization messages may vary by JVM)");
    }
}


