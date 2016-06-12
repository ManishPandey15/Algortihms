package algorithms.backtracking.chapter9;

import java.util.Arrays;
// complexity O(2^n)

public class GenerateAllStringOfNBits {

	public int a[];

	public GenerateAllStringOfNBits(int n) {
		a = new int[n];
	}

	public void printBinary(int n) {

		if (n < 1) {
			System.out.println(Arrays.toString(a));
		} else {
			a[n-1]=0;
			printBinary(n-1);
			a[n-1]=1;
			printBinary(n-1);
		}

	}
	
	public static void main(String[] args) {
		
		int n =3;
		GenerateAllStringOfNBits gen= new GenerateAllStringOfNBits(n);
		gen.printBinary(n);
	}

}
