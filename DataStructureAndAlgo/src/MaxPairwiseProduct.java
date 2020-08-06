import java.util.Random;
import java.util.Scanner;

public class MaxPairwiseProduct {
	
	private static long maxProductSlow(long[] numArray) {
		long product = 0;
		for(int i=0;i<numArray.length;i++)
		{
			for(int j=i+1;j<numArray.length;j++)
			{
				product = Math.max(product, numArray[i]*numArray[j]);
			}
		}
		return product; 
	}

	private static long maxProductFast(long[] numArray) {
		long product = 0;
		
		int max_index1=-1;
		for(int i=0;i<numArray.length;i++)
		{
			if((max_index1 == -1)||(numArray[max_index1]<numArray[i])){
				max_index1 = i;
			}	
		}

		int max_index2 =-1;
		for(int j=0;j<numArray.length;j++){

			if(( j != max_index1) && ((max_index2 == -1)||(numArray[max_index2]<numArray[j]))){
				max_index2 = j;
			}		
		}
		product = numArray[max_index1]*numArray[max_index2];
		
		return product;
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] numArray = new long[n] ;
		for(int x=0; x<n; x++)
		{
			long num = scan.nextInt();
			numArray[x] = num ;
		}
		System.out.println(maxProductFast(numArray));
		scan.close();
	}
}
