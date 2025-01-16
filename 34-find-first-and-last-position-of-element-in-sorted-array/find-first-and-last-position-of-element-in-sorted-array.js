/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function(nums, target) {
    // Step 1: Find the first occurrence of the target
    const findLeft = () => {
        let left = 0, right = nums.length - 1;
        let result = -1; // Initialize to -1 (not found)
        
        while (left <= right) {
            let mid = Math.floor((left + right) / 2);
            
            if (nums[mid] === target) {
                result = mid; // Store the position
                right = mid - 1; // Narrow down to the left side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    };
    
    // Step 2: Find the last occurrence of the target
    const findRight = () => {
        let left = 0, right = nums.length - 1;
        let result = -1; // Initialize to -1 (not found)
        
        while (left <= right) {
            let mid = Math.floor((left + right) / 2);
            
            if (nums[mid] === target) {
                result = mid; // Store the position
                left = mid + 1; // Narrow down to the right side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    };
    
    // Perform both searches
    const leftIndex = findLeft();
    const rightIndex = findRight();
    
    return leftIndex === -1 ? [-1, -1] : [leftIndex, rightIndex];
};