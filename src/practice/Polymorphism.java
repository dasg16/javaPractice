package practice;

class Abc {

	public void show() {
		System.out.println("I am in A");
	}

}

class Bcd extends Abc {

	public void show() {
		System.out.println("I am in B");
	}

}

class C extends Abc {

	public void show() {
		System.out.println("I am in C");
	}

}

public class Polymorphism {

	public static void main(StringTest[] args) {
		Abc obj = new Bcd();
		obj.show();

		obj = new C();
		obj.show();

	}

}
