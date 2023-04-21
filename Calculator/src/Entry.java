import java.io.IOException;

public class Entry {

	public static void main(String[] args) throws IOException {
		
		Menu menu = new Menu();
		int choice = menu.show();
	
		System.out.println("Please Enter first number");
		int number1 =BasicInput.readInteger();
		
		System.out.println("Please Enter Second number");
		int number2 =BasicInput.readInteger();
		
		Maths m = new Maths();
		
		switch(choice) {
			case 1 : m.add(number1, number2); break;
			case 2 : m.subtract(number1, number2); break;
			case 3 : m.multiply(number1, number2); break;
			case 4 : m.divide(number1, number2); break;
		}
		
	}
}