import java.util.Scanner;

public class MainClass
{
	 
	
	public static void main(String args[])
	{
		 
		Scanner kbdInput = new Scanner(System.in);
		 DisplayResults myDisplay = new DisplayResults();
		 Calculator myCalc = new Calculator();
		 Menu myMenu = new Menu();
		 int menuSelection = myMenu.showMenu();
		
		 
		 		double value1 = 0.0;
				double value2 = 0.0;
				
				System.out.print("Please enter a numerical value: ");
				value1 = kbdInput.nextDouble();
				
				System.out.print("Please enter another numerical value: ");
				value2 = kbdInput.nextDouble();
				
				
				
				Calculator myCalculator = new Calculator();
				
				System.out.print("menu selection "+menuSelection);
		 
		if (menuSelection == 1) {
			Calculator addition1 = new Calculator();
			addition1.addition(value1, value1);
			myDisplay.showResult(value1, value2, myCalc.addition(value1, value2));
		
		}
		else if (menuSelection == 2) {
			Calculator subtraction1 = new Calculator();
			subtraction1.subtraction(value1, value1);  
			myDisplay.showResult(value1, value2, myCalc.subtraction(value1, value2));
		}
		else if (menuSelection == 3) {
			Calculator multiplication1 = new Calculator();
			multiplication1.multiplication(value1, value1);
			myDisplay.showResult(value1, value2, myCalc.multiplication(value1, value2));
		}
		else if (menuSelection == 4) {
			Calculator division1 = new Calculator();
			division1.division(value1, value1);  
			myDisplay.showResult(value1, value2, myCalc.division(value1, value2));
		}
		else if (menuSelection == 5) {
			Calculator squareroot1 = new Calculator();
			squareroot1.squareroot(value1, value1);  
			myDisplay.showResult(value1, value2, myCalc.squareroot(value1, value2));
		}
		else if (menuSelection == 6) {
			
		}
		 
		
		
		 System.out.println("\nProgram terminates.");
		 System.exit(0);
	}
	
}
