import java.util.Arrays;

class ConcatenationArray{
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n * 2];
        
        for (int i = 0; i < n * 2; i++) {
            ans[i] = nums[i % n];
        }
        return ans;
    }

    public static void main (String[] args) {
        ConcatenationArray ca = new ConcatenationArray();
        int[] intArray = {1,2,1};
        int[] result = ca.getConcatenation(intArray);
        System.out.println(Arrays.toString(result));
    }
}