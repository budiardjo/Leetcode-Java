import java.util.Arrays;

class coret {
    public double[] findAverages(int k, int[] array) {
        double[] result = new double[array.length - k + 1];
        double windowSum = 0;
        int windowStart = 0;
        for ( int windowEnd = 0; windowEnd < array.length; windowEnd++) {
            windowSum += array[windowEnd];

            if (windowEnd >= k - 1) {
                result[windowStart] = windowSum / k;
                windowSum -= array[windowStart];
                windowStart++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        coret c = new coret();
        int[] question = {1,3,2,6,-1,4,1,8,2};
        int target = 5;
        double[] result = c.findAverages(target, question);
        System.out.println(Arrays.toString(result));
        
    
    }
}