package api;

import java.util.Arrays;

public class ArraysCopyExam {

	public static void main(String[] args) {
		char [] arr1 = {'J','A','V','A'};
		//arr1을 복사하고 칸을 5칸 준다.
		char [] arr2 = Arrays.copyOf(arr1, 5);
		char [] arr3 = Arrays.copyOf(arr1, 3);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

}
