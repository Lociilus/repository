import java.util.Scanner;

public class Menu 
{
	public void start() {
		
		private Scanner kbdInput = new Scanner(System.in);
		private Calculator myCalc = new Calculator();
		private DisplayResults myDisplay = new DisplayResults();
		
		int showMenu()
		{
			System.out.println("Five-Function Calculator");
			System.out.println("Select a calculation by entering the number to \n" + "the left of the operation.\n");
			
			System.out.println("1.\tAddition");
			System.out.println("2.\tSubtraction");
			System.out.println("3.\tMultiplication");
			System.out.println("4.\tDivision");
			System.out.println("5.\tSquareRoot");
			System.out.println("6.\tQuit");
			
			System.out.print("\nPlease enter the number of the desired operation; ");
			return kbdInput.nextInt();}
		
		
		public void getUserValue()
		{
			double value1 = 0.0;
			double value2 = 0.0;
			
			System.out.print("Please enter a numerical value: ");
			value1 = kbdInput.nextDouble();
			
			System.out.print("Please enter another numerical value: ");
			value2 = kbdInput.nextDouble();
			
			myDisplay.showResult(value1, value2, myCalc.addition(value1, value2));
			
			Calculator myCalculator = new Calculator();
			
			myCalculator.start();
		
		}

	}


