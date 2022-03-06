public class FindMaxConsecutiveOne {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (null == nums){
            return 0;
        }
        int count = 0;
        int max = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count++;
            }else {
                if(count > max){
                    max = count;
                }
                count = 0 ;
            }
        }

        max = count > max ? count : max;
        return max;
    }
    
    public static void main(String[] args){
        FindMaxConsecutiveOne mn = new FindMaxConsecutiveOne();
        int[] intArray =  {1,1,0,1,1,1};
        int result = mn.findMaxConsecutiveOnes(intArray);
        System.out.println(result);
    }

}
