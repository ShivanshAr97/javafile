class MyThread extends Thread {
    public void run() {
        System.out.println("Thread started.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread finished.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        thread.start();

        if (thread.isAlive()) {
            System.out.println("Thread is running.");
        }

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        if (!thread.isAlive()) {
            System.out.println("Thread has finished.");
        }

        thread.setPriority(5);

        System.out.println("Main program finished.");
    }
}