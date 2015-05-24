package upamanyu.ishan.hackerRank.solutions;

import java.util.Scanner;

public class MultiplesOf3And5 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		int sum = 0;
		int n;

		for (int i = 0; i < t; i++) {
			n = in.nextInt();
			sum = sumOfMultiples(1,n);
			System.out.println(sum);
		}
		in.close();
	}

	private static int sumOfMultiples(int a, int b) {
		int sum = 0;

		if (a - b <= 5) {
			for (int i = a; i < b; i++) {
				if ((i % 3 == 0) || (i % 5 == 0)) {
					sum += i;
				}
			}
		} else {
			int mid = (a+b)/2;
			sum = sumOfMultiples(a, mid) 
					+ sumOfMultiples(mid+1, b);
		}
		return sum;
	}
}