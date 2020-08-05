import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class APlusB.
 * the class performs basic addition
 */
public class APlusB{

	/**
	 * Sum of two digits.
	 *
	 * @param firstNum the first num
	 * @param secondNum the second num
	 * @return the int
	 */
	static int sumOfTwoDigits(int firstNum, int secondNum)
	{
		return firstNum + secondNum;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();

		System.out.println(sumOfTwoDigits(x,y));
	}
}
