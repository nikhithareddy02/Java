package ds;

public class MaximumSubsetArray {
	public static void main(String[] args) {
		MaximumSubsetArray max = new MaximumSubsetArray();
		int [] a = {-2, -3, -4, -1, -2, 2, -5, -3};
		System.out.println("Maximum contiguous sum is " +
				max.maxSumSubset(a));	
	}
	int maxSumSubset(int[] array) {
		int maxsum = 0;
		for (int i = 0; i < array.length; i++) {
			if(maxsum < array[i]) {
				maxsum = array[i];
			}
			else if(array[i] > 0){
				maxsum += array[i];
			}
		}
        return maxsum;
	}
}
