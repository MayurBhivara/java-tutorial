package parameters;

class robot {
	String name;

	public void intro(String name) {
		System.out.println("my name is " + name);

	}

	public void movement(int distance, String direction) {
		System.out.println("moving " + distance + " meters " + direction);

	}
}

public class App {

	public static void main(String[] args) {
		robot sam = new robot();
		sam.name = "sam";
		sam.intro(sam.name);
		sam.movement(25, "west");

	}

}
