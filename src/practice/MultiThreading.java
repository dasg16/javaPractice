package practice;

//whenever we want to use a thread we have two ways:
//1. By extends Thread
//2. By implements Runnable

class Hi implements Runnable {
	// method name must be run when using thread.
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}

class Hello implements Runnable {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}

public class MultiThreading {

	public static void main(StringTest[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// When extends is used for multithreading.
		// Hi obj1 = new Hi();
		// Hello obj2 = new Hello();
		// // always use start() method in thread to run the run method.
		// obj1.start();
		// try {
		// // using thread.sleep here so that both doesn't execute the code at the same
		// // time.
		// Thread.sleep(10);
		// } catch (Exception e) {
		// }
		// obj2.start();

		Hi obj1 = new Hi();
		Hello obj2 = new Hello();

		// when implementing thread create thread objects. That's the only difference.
		// See above code to compare.
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		// always use start() method in thread to run the run method.
		t1.start();
		try {
			// using thread.sleep here so that both doesn't execute the code at the same
			// time.
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start();

		// Setting thread names
		t1.setName("I am thread one");
		t2.setName("I am thread two");

		// Getting thread names
		System.out.println(t1.getName());
		System.out.println(t2.getName());

		// Setting thread priority
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(4);

		// Getting thread priority
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		t1.join();
		t2.join();

		System.out.println(t1.isAlive());
		System.out.println("waiting for thread t1 and t2 to join and then I am printing bye to get out of the code");

	}

}
