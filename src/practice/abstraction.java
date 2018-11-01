package practice;

abstract class Abcd {
	public abstract void add();

	public void subtraction() {
		System.out.println("Substraction");

	}

	public void division() {

		System.out.println("Division");

	}

	public abstract void multiplication();

}

abstract class Bcde extends Abcd {

	public void add() {
		System.out.println("Add");
	}

	public abstract void multiplication();
}

class Cdef extends Bcde {
	public void multiplication() {
		System.out.println("Multiplication");

	}

}

public class abstraction {

	public static void main(String[] args) {

		Cdef obj = new Cdef();
		obj.add();

	}

}
