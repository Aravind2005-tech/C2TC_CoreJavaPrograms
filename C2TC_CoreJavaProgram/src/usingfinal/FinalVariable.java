
// Program to demonstrate final Variable
package usingfinal;

public class FinalVariable {

	// final int x; // final instance variable must be initialized

	int x = 100;

	// Declare a static blank final variable.
	final static int Y;

	// Declare & intialize static final variable.
	final static int Z = 10;

	// instatnce method
	void change() {
		x = 30; 
		Y = 200;
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		Y = 20;
		Z = 100; // Once intialized can't be reassigned
		System.out.println("Value of Y: " + Y);
	}

}