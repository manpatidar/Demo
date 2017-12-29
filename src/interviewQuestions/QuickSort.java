package interviewQuestions;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		Integer array[] = new Integer[]{12,45,78,23,54,17,38,42,64,87,21};
		quicksort(array, 0, array.length -1);
		
		System.out.println(Arrays.toString(array));
	}

	private static void quicksort(Integer[] array, int low, int high) {

		if(array == null || array.length == 0)
			return;
		if(low >= high)
			return;
		
		int middle = low + (high - low)/2;
		int pivot = array[middle];
		
		int l = low, h = high;
		while(l<=h)
		{
			while(array[l] < pivot)
			{
				l++;
			}
			while(array[h] > pivot)
			{
				h--;
			}
			if(l<=h)
			{
				int temp = array[l];
				array[l++]= array[h];
				array[h--]= temp;
			}
			
		}
		if (low<h)
			quicksort(array, low, h);
		if(high>l)
			quicksort(array, l, high);
		
	}

}
