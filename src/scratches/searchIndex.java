package scratches;

class searchIndex {
    int i;
    public int searchInsert(int[] nums, int target) {

        for ( i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            else if(target < nums[i]){
                return i;
            }
        }
        return i;
    }
}





