class MultithreadingDemo extends Thread {
	public void run()
	{
		try {
			System.out.println("Thread " + Thread.currentThread().getId()+ " running");
		}
		catch (Exception e) {
			System.out.println("Exception caught");
		}
	}
}

public class Main {
	public static void main(String[] args)
	{
		int n = 5;
		for (int i = 0; i < n; i++) {
		    MultithreadingDemo object = new MultithreadingDemo();
			object.start();
		}
	}
}
