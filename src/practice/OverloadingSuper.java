package practice;

abstract class Perform {

	abstract void performAdd(Perform i, Perform J);

}

abstract class Integers extends Perform {

	public void performAdd(int i, int j) {

		double addition = i + j;
		System.out.println("Performed addition with ints:- " + addition);
	}

}

// class Doubles extends Perform {
//
// public void performAdd(double p, double q) {
//
// double addition = p + q;
// System.out.println("Performed addition with doubles:- " + addition);
// }
// }
//
// class Constructor {
//
// public static void main(String arg[]) {
//
// Perform obj1 = new Doubles();
// Perform obj2 = new Integers();
// obj1.performAdd();
//
// }
//
// public void performAdd(Perform obj) {
//
// obj.performAdd();
// System.out.println("Performed addition");
// }
//
// }
