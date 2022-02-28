class MainRemoveDuplicates {

    public static void main(String[] args){
        MainRemoveDuplicates mn = new MainRemoveDuplicates();
        int[] intArray =  {1,1,2};
        int result = mn.removeDuplicates(intArray);
        System.out.println(result);
    }

    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int itr = 1; itr < nums.length; itr++) {
            if(nums[itr] != nums[index]) {
                index++;
                nums[index] = nums[itr];
            }
        }
        return (index + 1);
    }




}
