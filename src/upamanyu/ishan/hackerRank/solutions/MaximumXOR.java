package upamanyu.ishan.hackerRank.solutions;

import java.util.Scanner;

/**
 * The Class MaximumXOR.
 * 
 *  Problem Statement
		Given two integers, L and R, find the maximal value of A xor B,
		where A and B satisfy the following condition:
			L≤A≤B≤R
		
	Input Format
		The input contains two lines; L is present in the first line and 
		R in the second line.

	Constraints 
		1≤L≤R≤103

	Output Format
		The maximal value as mentioned in the problem statement.

*/
public class MaximumXOR {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int l, r;
		l = in.nextInt();
		r = in.nextInt();
		System.out.println(maxXOR(l, r));

	}

	/**
	 * Function to calculate maximum xor
	 *
	 * @param l the l
	 * @param r the r
	 * @return the int
	 */
	private static int maxXOR(int l, int r) {
		int maxValue = 0;
		for (int a = l; a <= r; a++) {
			for (int b = a; b <= r; b++) {
				maxValue = ((a ^ b) > maxValue) ? a ^ b : maxValue;
			}
		}
		return maxValue;
	}
}