package algorithms.backtracking.chapter9;

import java.util.Arrays;

public class GenerateKArrayString {
	public int a[];

	public GenerateKArrayString(int n) {
		a = new int[n];
	}

	public void printBinary(int n, int k ) {

		if (n < 1) {
			System.out.println(Arrays.toString(a));
		} else {
			for (int i = 0; i < k; i++) {
				
				a[n-1]=i;
				printBinary(n-1, k);
			}
		}

	}
	
	public static void main(String[] args) {
		
		int n =3;
		int k =3;
		GenerateKArrayString gen= new GenerateKArrayString(n);
		gen.printBinary(n,k);
	}
}
