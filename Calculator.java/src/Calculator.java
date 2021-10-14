import java.lang.Math;
	public class Calculator 
	{
		// public void start()
//		{
//			
//		}
		
		public double addition(double num1, double num2)
		{
			return (num1 + num2);
		}
		
		public double subtraction(double num1, double num2)
		{
			return (num1 - num2);
		}
		
		public double multiplication(double num1, double num2)
		{
			return (num1 * num2);
		}
		public double division(double num1, double num2)
		{
			return (num1 / num2);
		}
		public double squareroot(double num1, double num2)
		{
			return (Math.sqrt(num1));
		}
		
		public void moveToDisplay()
		{
			DisplayResults myDisplayResults  = new DisplayResults();
			
			//myDisplayResults.start();
		}
	}

