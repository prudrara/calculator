package calculator;

public class calcTest {

	public static void main (String args[]) {
		Calculator test = new Calculator(5, 5);
		test.addition(3);
		System.out.println("the sum is: " + test.addition(3));
		test.subtraction(3);
		System.out.println("the difference is: " + test.subtraction(3));
		test.multiplication(4);
		System.out.println("the product is: " + test.multiplication(4));
		test.division(4);
		System.out.println("the division is: " + test.division(5));
		
		Calculator test2 = new Calculator(5, 5);
		test2.addition(3,5);
		System.out.println("the sum is: " + test2.addition(3,5));
		test2.subtraction(3,3);
		System.out.println("the difference is: " + test2.subtraction(3,3));
		test2.multiplication(4,4);
		System.out.println("the product is: " + test2.multiplication(4,4));
		test2.division(4,3);
		System.out.println("the division is: " + test.division(4,3));
		
	}
}
