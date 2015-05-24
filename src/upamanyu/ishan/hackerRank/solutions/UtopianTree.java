/*A class to find the height of tree, given the number of growth
 * cycles. The first growth cycle occurs during the spring, when 
 * it doubles in height. The second growth cycle occurs during 
 * the summer, when its height increases by 1 meter.
 * 
 */
package upamanyu.ishan.hackerRank.solutions;

import java.util.Scanner;

public class UtopianTree {
	
	private static final int INITIAL_HEIGHT = 1;
	
	/**
	 * Calculate height.
	 *
	 * @param numCycles the num cycles
	 * @return the int
	 */
	private static  int calculateHeight(int numCycles){
		int height = INITIAL_HEIGHT;
		
		for(int i=1; i<=numCycles; i++){
			if ( i%2 == 0){
				height+=1;
			}else{
				height*=2;
			}
		}
		 return height;
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int t;
		int height = 0;
		int a, b;
		t = in.nextInt();
		for (int i = 0; i < t; i++) {
			a = in.nextInt();
			
			height = calculateHeight(a);
			System.out.println(height);
		}
	}
}

