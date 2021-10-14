import java.util.Scanner;

public class Menu 
{
	//public void start() {
		private Scanner kbdInput = new Scanner(System.in);
		private Calculator myCalc = new Calculator();
		private DisplayResults myDisplay = new DisplayResults();
		
		public int showMenu()
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
			return kbdInput.nextInt();
			
		
		}
		
		
		
			
			//myCalculator.start();
		
		}

	
