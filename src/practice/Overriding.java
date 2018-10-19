package practice;

class A {
	public void show() {
		System.out.println("I am in A");

	}

}

class B extends A {

	@Override
	public void show() {
		// super could be used here too for avoiding method overriding.
		super.show();
		System.out.println("I am in B");

	}
}

public class Overriding {

	public static void main(StringTest args[]) {

		B obj1 = new B();
		obj1.show();

	}

}
