package practice;

abstract class Shoes {

	public abstract String ShoesSize();

}

class KidShoes extends Shoes {

	public String ShoesSize() {

		return "2 to 7";

	}

}

class AdultShoes extends Shoes {

	public String ShoesSize() {

		return "5 to 10";

	}

}

public class AbstractionPart2 {

	public static void main(String[] args) {

		AbstractionPart2 obj = new AbstractionPart2();

		KidShoes ks = new KidShoes();
		AdultShoes as = new AdultShoes();
		// I can use the following obj initialization
		// instead of the above two
		// Shoes ks = new KidShoes();
		// Shoes as = new AdultShoes();

		obj.show(as);
	}

	// public void show(KidShoes ks) {
	//
	// System.out.println(ks.ShoesSize());
	//
	// }

	public void show(Shoes as) {

		System.out.println(as.ShoesSize());

	}

}
