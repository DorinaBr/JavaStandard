package session16_lambda.practice;

public class ThreadPractice {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Running a separated thread");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
