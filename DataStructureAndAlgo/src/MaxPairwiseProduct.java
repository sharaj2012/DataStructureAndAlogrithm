import java.util.Scanner;

public class MaxPairwiseProduct {

	private static int maxProduct(int[] numArray) {

		int product = 0;
		for(int i=0;i<numArray.length;i++)
		{
			for(int j=i+1;j<numArray.length;j++)
			{
				product = Math.max(product, numArray[i]*numArray[j]);
			}
		}
		return product;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] numArray = new int[n] ;
		for(int x=0; x<n; x++)
		{
			int num = scan.nextInt();
			numArray[x] = num ;
		}
		System.out.println(maxProduct(numArray));
		scan.close();
	}
}
