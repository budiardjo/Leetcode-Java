import java.util.Arrays;

class ConcatenationArray{
    // public int[] getConcatenation(int[] nums) {
    //     System.out.println(Arrays.toString(nums));
    //     int n = nums.length;
    //     int[] ans = new int[n * 2]; // 3 * 2 = 6 // 

    //     for (int i = 0; i < n * 2; i++) {
    //         ans[i] = nums[i % n]; // 1 mod 6 = 1
    //         System.out.println(Arrays.toString(ans));
    //     }
    //     return ans;
    // }

    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        System.out.println(nums.length);
        for(int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            System.out.println(Arrays.toString(result));

            result[i + nums.length] = nums[i]; // set index of result to value in nums, and mirror
        }
        return result;
    }

    public static void main (String[] args) {
        ConcatenationArray ca = new ConcatenationArray();
        int[] intArray = {1,2,1};
        int[] result = ca.getConcatenation(intArray);
        System.out.println(Arrays.toString(result));
    }
}