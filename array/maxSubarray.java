class maxSubarray {
    
    public int maxSubArray(int[] array) {
        int sum = 0;
        int result = array[0];
        for (int element : array) {
            sum += element;
            result = Math.max(result, sum);
            sum = Math.max(sum, 0);
        }
        return result;
    }

    public static void main(String[] args) {
        maxSubarray ms = new maxSubarray();
        int[] intArray = {-2,1,-3,4,-1,2,1,-5,4};
        int result = ms.maxSubArray(intArray);
        System.out.println(result);
    }
     
}
