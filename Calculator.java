package calculator;

public class Calculator {

	//instance variables
	int x,y;
	
	// constructor
	public Calculator() {
		
	}
	// parameterized constructor
	public Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public float addition(float x) {
		float addition = x+y;
		return addition;
	}
	
	public float subtraction(float x) {
		float subtraction = x-y;
		return subtraction;
	}
	public float multiplication(float x) {
		float multiplication = x*y;
		return multiplication;
	}
	public float division(float x) {
		float division = x/y;
		return division;
	}
	
	public float addition(float x, float y) {
		float addition = x+y;
		return addition;
	}
	
	public float subtraction(float x, float y) {
		float subtraction = x-y;
		return subtraction;
	}
	public float multiplication(float x, float y) {
		float multiplication = x*y;
		return multiplication;
	}
	public float division(float x, float y) {
		float division = x/y;
		return division;
	}
	
}
