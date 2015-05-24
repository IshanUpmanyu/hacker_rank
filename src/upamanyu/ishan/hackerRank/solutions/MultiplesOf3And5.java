package upamanyu.ishan.hackerRank.solutions;

import java.util.Scanner;

public class MultiplesOf3And5{
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		int sum = 0;
		int n;
		
		for (int i = 0; i < t; i++) {
			n = in.nextInt();
			sum = sumOfMultiples(n);
			System.out.println(sum);
		}
	}

	private static int sumOfMultiples(int n) {
		int sum = 0;
		for(int i = 1; i<n; i++){
			if((i%3==0)||(i%5 ==0)){
				sum +=i;
			}
		}
		return sum;
	}
}