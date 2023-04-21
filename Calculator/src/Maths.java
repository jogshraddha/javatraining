
public class Maths {

	public void add(int a, int b) {
		int result = a + b;
		System.out.println("Addition is "+ result);
	}
	
	public void subtract(int a, int b) {
		int result = 0;
		if(a > b) {
			result = a - b;
		} else {
			result = b - a;
		}
		System.out.println("subtraction is "+ result);
	}
	
	public void multiply(int a, int b) {
		int result = a * b;
		System.out.println("Multiplication is "+ result);
	}
	
	public void divide(int a, int b) {
		int result = 0;
		if( b != 0) {
			result = a / b;
		}
		System.out.println("division is "+ result);
	}
	
	public void square(int a) {
		int result = a * a;
		System.out.println("Square of "+ a +" is "+ result);
	}
	
	public void cube(int a) {
		int result = a * a * a;
		System.out.println("Cube of "+ a +" is "+ result);
	}
}
