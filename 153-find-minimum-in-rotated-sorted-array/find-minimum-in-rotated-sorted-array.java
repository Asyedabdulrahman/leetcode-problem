class Solution {
    public int findMin(int[] nums) {
        if(nums.length < 1 & nums == null) return -1;

        int left = 0, right = nums.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(nums[mid] > nums[right]){
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return nums[left];
        
    }
}