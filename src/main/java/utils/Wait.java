package utils;

public class Wait {

    public static void waitFor(long seconds) {
        try {
            Thread.sleep(seconds*1000);
            System.err.println("Wait for "+seconds+" seconds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
