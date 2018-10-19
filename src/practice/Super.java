package practice;

class SuperClass {

	public SuperClass() {
		System.out.println("Omg! I am in the super class right now");
	}

	public SuperClass(int i) {
		System.out.println("I am in the super class parameterized constructor");
	}

}

class SubClass extends SuperClass {

	public SubClass() {
		// here you cannot pass "i" rather use an actual integer.
		super(5);
		System.out.println("Noways! They pushed me to the subclass now but at least I have additional features now");
	}

	public SubClass(int i) {
		super(i);
		System.out.println("life is tough");
	}

}

public class Super {

	public static void main(StringTest args[]) {

		SubClass objSub = new SubClass();

	}

}
