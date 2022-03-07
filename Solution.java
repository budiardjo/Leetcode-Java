import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args){
        Solution mn = new Solution();
        int[] intArray =  {2,7,13,15};
        int[] result = mn.twoSum(intArray, 20);
        System.out.println(Arrays.toString(result));
    }


    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        
        if(nums==null || nums.length==0)
            return res;
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            int numToFind = target-nums[i];
            if(map.containsKey(numToFind)){
                res[0] = map.get(numToFind);
                res[1] = i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
