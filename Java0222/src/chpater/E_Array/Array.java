package chpater.E_Array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[3]; // 배열 크기 지정.
		
		int array[] = {1, 2, 3};
		String sArray[] = {"사과", "배"}; 
		System.out.println(Arrays.toString(sArray));
		
		int multiArray[][] = {{1,2,3} , {4,5,6}};
		System.out.println(Arrays.deepToString(multiArray));
		
		for(int i = 0 ; i < multiArray.length ; i++) {
			int[] mArray = multiArray[i];
			for(int j = 0 ; j < mArray.length ; j++) {
				System.out.println(mArray[j]);
			}
		}
	}

}
