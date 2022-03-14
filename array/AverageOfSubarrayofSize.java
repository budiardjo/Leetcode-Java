import java.util.Arrays;

class AverageOfSubarrayofSize {
    
    public static double[] findAverages(int[] array, int k) {
        double[] result = new double[array.length - k + 1];
        for ( int i = 0; i <= array.length - k; i++) {
            double sum = 0;
            for ( int j = i; j< i+k; j++) {
                sum += array[j];
            result[i] = sum /k;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        double[] result = AverageOfSubarrayofSize.findAverages(new int[] {1,3,2,6,-1,4,1,8,2}, 5);
        System.out.println(Arrays.toString(result));

    }
    

}
