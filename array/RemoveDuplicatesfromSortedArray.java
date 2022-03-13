class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int position = 1;
        for (int index = 1, previouslyEncountered = array[0]; index < array.length ; index++) {
            if (array[index] != previouslyEncountered) {
                array[position++] = array[index];
                previouslyEncountered = array[index];
            }
        }

        return position;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray rd = new RemoveDuplicatesfromSortedArray();
        int[] intArray = {1,1,2};
        int result = rd.removeDuplicates(intArray);
        System.out.println(result);
    }
}
