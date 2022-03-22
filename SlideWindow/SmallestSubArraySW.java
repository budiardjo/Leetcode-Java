class SmallestSubArraySW {
    public int findMinSubArray(int s, int[] array) {
        int windowSum = 0, minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < array.length; windowEnd++) {
            windowSum += array[windowEnd];
            while ( windowSum >= s) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= array[windowStart];
                windowStart++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }


    public static void main (String[] args) {
        SmallestSubArraySW ss = new SmallestSubArraySW();
        int[] intArray = {2,1,5,2,3,2};
        int target = 7;
        int result = ss.findMinSubArray(target, intArray);
        System.out.println(result);
    }




}
