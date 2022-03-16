import java.util.Arrays;

class AverageOfSubarrayofSize {
    
    public double[] findAverages(int[] array, int k) {
        double[] result = new double[array.length - k + 1 ];
        System.out.println(Arrays.toString(result));
        System.out.println(array.length);
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
        AverageOfSubarrayofSize aos = new AverageOfSubarrayofSize();
        int[] question = {1,3,2,6,-1,4,1,8,2};
        int target = 5;
        double[] result = aos.findAverages(question, target);
        System.out.println(Arrays.toString(result));

    }
    

}
