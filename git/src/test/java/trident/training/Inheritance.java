package trident.training;

class hobby extends Inheritance {

	void driving() {
		System.out.println("car");

	}
}

class fun extends hobby {
	void moving() {
		System.out.println("hi");
	}
}

public class Inheritance {
	void eating() {
		System.out.println("biriyani");
	}

	void eating(int lunch) {
		System.out.println("mutton biriyani");
	}

	void eating (String dinner) {
		System.out.println("dosa");
	}

	public static void main(String[] args) {
		fun d1 = new fun();
		d1.eating("aasd");

	}

}
