public class MaxSumSubArraySW {
    public int findMaxSumSubArray(int k, int[] array) {
        int windowSum = 0, maxSum = 0;
        int windowStart = 0;
        for ( int windowEnd = 0; windowEnd < array.length; windowEnd++) {
            windowSum += array[windowEnd];

            if ( windowEnd >= k - 1 ); {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= array[windowStart];
                windowStart++;
            }
        }

        return maxSum;
    } 

    public static void main(String[] args) {
        MaxSumSubArraySW msw = new MaxSumSubArraySW();
        int[] intArray = {2,1,5,1,3,2};
        int target = 3;
        int result = msw.findMaxSumSubArray(target, intArray);
        System.out.println(result);
    }
    
}
