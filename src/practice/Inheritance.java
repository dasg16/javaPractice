package practice;

class Calculator {

	int sum;

	public int add(int i, int j) {

		sum = i + j;
		return sum;

	}
}

class AdvCalculator extends Calculator {

	int minus;

	public int sub(int i, int j) {

		minus = i - j;
		return minus;
	}
}

public class Inheritance {

	public static void main(StringTest args[]) {
		AdvCalculator obj1 = new AdvCalculator();
		obj1.sub(8, 3);
		// you can take return this way
		System.out.println(obj1.minus);
		// or you can take return the following way
		int result = obj1.sub(10, 8);
		System.out.println(result);

		obj1.add(10, 10);
		System.out.println(obj1.sum);
	}
}
