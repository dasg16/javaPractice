package practice;

class Practice {

	int a;
	int b;

	// public Practice() {
	// a = 20;
	// b = 40;
	// }

	public Practice(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void NormalMethod() {
		System.out.println("I am in a normal method");
	}

}

public class Constructor {

	public static void main(StringTest[] args) {

		// Practice obj = new Practice();
		// System.out.println(obj.a);
		// System.out.println(obj.b);
		Practice obj1 = new Practice(10, 20);
		System.out.println(obj1.a);
		System.out.println(obj1.b);

		// obj.NormalMethod();
	}

}
