package practice;

class TestEncapsulation {

	private int sizePen;

	private String color;

	public void setSize(int i) {
		sizePen = i;
	}

	public void getSize() {
		System.out.println(sizePen);

	}

	public void setColor(String str) {
		color = str;
	}

	public void getColor() {

		System.out.println(color);

	}

}

public class Encapsulation {

	public static void main(String[] args) {

		TestEncapsulation te = new TestEncapsulation();

		te.setSize(4);
		te.setColor("Blue");

		te.getSize();
		te.getColor();

	}

}
