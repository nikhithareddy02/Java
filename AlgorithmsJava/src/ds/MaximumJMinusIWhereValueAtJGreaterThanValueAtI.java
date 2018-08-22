package ds;
/*Given an array arr[], find the maximum j – i such that arr[j] > arr[i].*/
public class MaximumJMinusIWhereValueAtJGreaterThanValueAtI {
	public static void main(String[] args) {
		MaximumJMinusIWhereValueAtJGreaterThanValueAtI m = new MaximumJMinusIWhereValueAtJGreaterThanValueAtI();
		int[] a = {34, 8, 10, 3, 2, 80, 30, 33, 1};//{9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
		System.out.println(m.findMaxDifference(a));
		System.out.println(m.otherMethodFindDiff(a));
	}
	public int findMaxDifference(int[] array){
		int diff,i,j;
		diff = 0-array.length;
		for (i = 0; i < array.length; i++) {
			for (j = i+1; j < array.length; j++) {
				diff = j-i > diff && array[j] > array[i] ? j-i : (i-j > diff && array[i] > array[j]?i-j:diff);
			}
		}
		return diff;
	}
	public int otherMethodFindDiff(int[] array) {
		int max=array[0],min=array[0],i,maxIndex=0,minIndex=0;
		for (i = 0; i < array.length; i++) {
			max = max > array[i] ? max : array[i];
			maxIndex =  max > array[i] ? maxIndex : i;
			min = min < array[i] ? min : array[i];
			minIndex =  min < array[i] ? minIndex : array[i];
		}
				
		return (maxIndex-minIndex);
	}
}
