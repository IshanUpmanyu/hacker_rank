/*
 * 
 */
package upamanyu.ishan.hackerRank.solutions;

import java.util.Scanner;

/** Problem Statement
 * 		The Class MultiplesOf3And5 finds sum of all multiples of 
 * 		3 and 5 which are less than a given number.
 * 		eg. If we list all the natural numbers below 10 that are multiples
 *  	of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	Input Format 
		First line contains T that denotes the number of test cases. This is 
		followed by T lines, each containing an integer, N.

	Output Format 
		For each test case, print an integer that denotes the sum of all the
		multiples of 3 or 5 below N.

	Constraints 
		1≤T≤10^5 
		1≤N≤10^9
 */
public class MultiplesOf3And5{
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int n;
		for (int i = 0; i < t; i++) {
			n = in.nextInt();
			System.out.println(sumOfMultiples(n));
		}
		in.close();
	}

	private static long sumOfMultiples(long n) {
	
		//Calculate sum of multiples of 3
		long lastMulOf3 = lastMultipleOfNLessThanM(3,n);
		long sumOf3Series = sumOfSeries(3, lastMulOf3, 3);
		
		//Calculate sum of multiples of 5
		long lastMulOf5 = lastMultipleOfNLessThanM(5,n);
		long sumOf5Series = sumOfSeries(5, lastMulOf5, 5);
		
		//Calculate sum of multiples of 15(i.e. 3*5)
		long lastMulOf15 = lastMultipleOfNLessThanM(15,n);
		long sumOf15Series = sumOfSeries(15, lastMulOf15, 15);
		
		return (sumOf3Series + sumOf5Series -sumOf15Series);
	}
	
	/**
	 * Last multiple of n less than m.
	 * eg last multiple of 4 less that 100
	 *
	 * @param n the n
	 * @param m the m
	 * @return the long
	 */
	private static long lastMultipleOfNLessThanM(long n,long m){
		long count =n;
		m=m-1;
		while(count-- != 0){
			if(m % n == 0){
				return m;
			}else{
				m--;
			}
		}
		return m;
	}
		
			
	/**
	 * Sum of Arithmetic series given the first and last term
	 *
	 * @param a0 the first term of series
	 * @param l the last term of series
	 * @param d the the common difference in series
	 * @return the sum of series
	 */
	private static long sumOfSeries(long a0, long l, int d){
		long n = (l-a0)/d +1; 
		long sum = n*(a0 + l)/2;
		return sum;
	}
}