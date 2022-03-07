import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null) {
            return false;
        }

        Set<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++ ){
            if(!hs.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate mn = new ContainsDuplicate();
        int[] intArray = {1,2,3,3};
        boolean result = mn.containsDuplicate(intArray);
        System.out.println(result);
    }


}

