/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function (nums, target) {
    if (!nums || nums.length === 0) return -1; 

    let left = 0;
    let right = nums.length - 1;

    while (left <= right) {
        let mid = left + ((right - left) >> 1); //aovid potential overflow for larget numbers
        if (nums[mid] === target) return mid;

        if (nums[left] <= nums[mid]) {
            if (nums[left] <= target && target < nums[mid]) {
                right = mid - 1; 
            } else {
                left = mid + 1;  
            }
        } 
        else {
            if (nums[mid] < target && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
        }
    }

    return -1; 
};