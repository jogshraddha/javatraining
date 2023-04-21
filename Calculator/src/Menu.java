import java.io.IOException;

public class Menu {

	/*
	  public int show()
	  will show a menu and accept the choice
	   1. Add
	   2. Subtract
	   3. Multiply
	   4. Divide
	   // Please enter your choice
	   */
	 public int show() throws IOException {
	   System.out.println("Please choose your action : ");
	   System.out.println("1. Add");
	   System.out.println("2. Subtract");
	   System.out.println("3. Multiply");
	   System.out.println("4. Divide");
	   int choice = BasicInput.readInteger();
	   return choice;
	 }
}
