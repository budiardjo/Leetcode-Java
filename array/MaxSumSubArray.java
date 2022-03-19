import java.util.Arrays;

class MaxSumSubArray {
    public int findMaxSumSubArray(int k, int[] array) {
        int maxSum = 0, windowSum;
        for (int i = 0; i < array.length - k; i++) {
            windowSum = 0;
            for ( int j = i; j < i + k; j++) {
                windowSum += array[j];
            }
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        MaxSumSubArray ms = new MaxSumSubArray();
        int[] intArray = {2,1,5,1,3,2};
        int target = 3;
        int result = ms.findMaxSumSubArray(target, intArray);
        System.out.println(result);

    }
}
