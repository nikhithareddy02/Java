package ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation {
	//Function to print array
	public void printArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}
		System.out.println();
	}
	public static void main(String[] args) throws IOException {
		ArrayRotation ar = new ArrayRotation();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arrayStr = str.split(" ");
		int[] array = new int[arrayStr.length];
		int[] ar2 = new int[arrayStr.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(arrayStr[i]);
			ar2[i] = Integer.parseInt(arrayStr[i]);
		}
		//int[] ar2 = array;
		int shift = Integer.parseInt(br.readLine());//Number of elements to be shifted
		//*******Executing with method - Using Temporary Table *****************
		array = ar.rotateArrayUsingTempTable(array, shift);
		ar.printArray(array);
		//******** Executing with method - By rotating each and every element
		array = ar.rotateArrayByRotatingOneByOneElements(array, shift);
		ar.printArray(array);
		ar.leftRotate(ar2, 2);
		br.close();
	}
	///Method 1  - Using a temporary array of size shift
	///Time complexity O(n) n being length of array and space complexity being O(shift)
	public int[] rotateArrayUsingTempTable(int[] array,int shift) {
		int[] temp = new int[shift];
		int i = 0,k = 0;
		//Saving the elements which are to be shifted in a temporary
		for (i = 0; i < temp.length; i++) {
			temp[i] = array[i];
		}
		//Shifting the remaining array
		for (i = 0; i < array.length-shift; i++) {
			array[i] = array[i+shift];
		}
		for (i = array.length - shift; i < array.length; i++) {
			array[i] = temp[k];
			k = k+1;
		}
		return array;
	}	
	//Method - 2 Rotate one by one element in array
	//Time complexity O(n*shift) n being size of array Space Complexity O(1)
	public int[] rotateArrayByRotatingOneByOneElements(int[] array,int shift) {
		int temp = 0,i,j;
		for (i = 0; i < shift; i++) {
			temp = array[0];
			for (j = 0; j < array.length-1; j++) {
				array[j] = array[j+1];
			}
			array[j] = temp;
		}
		return array;
	}
	///By Reversing sub arrays
	/* Function to left rotate arr[] of size n by d */
    void leftRotate(int arr[], int d)
    {
        int n = arr.length;
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);
    }
    void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
