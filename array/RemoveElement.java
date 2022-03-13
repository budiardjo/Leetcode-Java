import java.util.Arrays;

class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i] ;
                k++;
            }
        }
        return k;
    }
    
    // public int removeElement(int[] nums, int val) {
    //     int k = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if(nums[i] != val) {
    //             nums[k] = nums[i];
    //             k++;
    //         }
    //     }
    //     return k;
    // }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] intArray = {3,2,2,3};
        int[] result = re.removeElement(intArray, 3);
        System.out.println(Arrays.toString(result));
    }

    // public static void main(String[] args) {
    //     RemoveElement re = new RemoveElement();
    //     int[] intArray = {3,2,2,3};
    //     System.out.println(re.removeElement(intArray, 3));
    // }
}
