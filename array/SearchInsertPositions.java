class SearchInsertPositions {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;

        int left = 0, right = nums.length - 1, middle;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (nums[middle] == target) return middle;
            else if (nums[middle] > target) right = middle - 1;
            else left = middle + 1;
        }

        return left;
    }

    public static void main(String[] args){
        SearchInsertPositions si = new SearchInsertPositions();
        int[] intArray = {1,3,5,6};
        int result = si.searchInsert(intArray, 7);
        System.out.println(result); 
    }
}
