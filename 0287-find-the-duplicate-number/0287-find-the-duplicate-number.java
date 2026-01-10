class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0; 
        while(i < nums.length){
            if(nums[i] == i + 1){
                i++;
                continue;
            }

            int correctIndex = nums[i] - 1;

            if(nums[correctIndex] == nums[i]){
                return nums[i];
            }

            swap(nums, i, correctIndex);
        }
        return -1;
    }
    private void swap(int[] nums, int first, int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    };
}