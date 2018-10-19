package practice;

class Emp {

	int eid;
	int salary;
	static String ceo;

	static {
		ceo = "larry";
	}

	public Emp() {
		// ceo = "Gourav";

	}

	public void show() {
		// System.out.println(eid + salary + ceo);
	}

}

public class Static {

	public static void main(StringTest args[]) {
		Emp Sam = new Emp();
		Sam.eid = 30920;
		Sam.salary = 100000;
		Sam.show();
		// System.out.println(Sam.eid + Sam.salary + Emp.ceo);

		Emp harris = new Emp();
		harris.salary = 30982;
		harris.salary = 75000;
		Sam.show();

	}
}
