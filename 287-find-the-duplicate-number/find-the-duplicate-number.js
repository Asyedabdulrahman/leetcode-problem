/**
 * @param {number[]} nums
 * @return {number}
 */
var findDuplicate = function(nums) {
    let seen = {}; // Object to track seen numbers
    for (let i = 0; i < nums.length; i++) {
        if (seen[nums[i]]) {
            return nums[i]; // Duplicate found
        }
        seen[nums[i]] = true; // Mark the number as seen
    }
    return -1; // No duplicate found
};
