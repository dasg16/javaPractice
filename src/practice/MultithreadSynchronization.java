package practice;

class Counter implements Runnable {

	int count;

	public synchronized void run() {

		count++;

	}
}

public class MultithreadSynchronization {

	public static void main(StringTest[] args) throws InterruptedException {

		Counter c = new Counter();

		Thread t1 = new Thread(c) {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.run();
				}
			}
		};

		Thread t2 = new Thread(c) {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.run();
				}
			}
		};

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println(c.count);

	}

}
