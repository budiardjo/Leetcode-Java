import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    
    // public int[] twoSum(int[] nums, int target) {
    //     for ( int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[] { i, j};
    //             }
    //         }
    //     }
    //     throw new IllegalArgumentException("No solution found");
    // }
    
    // public int[] twoSum(int[] numbers, int target) {
    //     Map<Integer, Integer> value2index = getMapping(numbers);
    //     for(int index = 0; index < numbers.length; index++){
    //         int required = target - numbers[index];
    //         if ( value2index.containsKey(required) && value2index.get(required) != index) {
    //             return new int[] {index, value2index.get(required)};
    //         }
    //     }
    //     return new int[0];
    // }

    // public Map<Integer, Integer> getMapping(int[] array) {
    //     Map<Integer, Integer> result = new HashMap<>();
    //     for (int index = 0; index < array.length; index++) {
    //         result.put(array[index], index);
    //     }
    //     return result;
    // }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for ( int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (numMap.containsKey(compliment)) {
                return new int[] {numMap.get(compliment), i};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match found!");
    }


    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] intArray = {2,7,13,15};
        int[] result = ts.twoSum(intArray, 20);
        System.out.println(Arrays.toString(result));
    }
}
