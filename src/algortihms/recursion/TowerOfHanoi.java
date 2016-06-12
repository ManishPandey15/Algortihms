package algortihms.recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	public void solveTowerHanoi(int n, String start, String end, String tem){
		
		if(n==1){
			System.out.println(start+"  -->>  "+ end);
		}
		else
		{
		  solveTowerHanoi(n-1, start, tem, end );
		  System.out.println(start +"  -->>  "+end);
		  solveTowerHanoi(n-1, tem, end, start);
		}
		
	}
	public static void main(String[] args) {
		TowerOfHanoi tow = new TowerOfHanoi();
		
		System.out.println("Please enter no of discs");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		tow.solveTowerHanoi(n, "A", "C", "B");
		
	}
	
}
