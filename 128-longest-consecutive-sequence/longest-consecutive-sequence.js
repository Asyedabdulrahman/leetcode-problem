/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums) {
    if (nums.length === 0) return 0;
    
    // Sort the array numerically
    let sorted = nums.sort((a, b) => a - b);
    
    let longest = 1;  // At least one number will form a sequence
    let cnt = 1;      // Initial count of consecutive numbers
    let lastSmaller = sorted[0];  // Start with the first number
    
    for (let i = 1; i < sorted.length; i++) {
        if (sorted[i] === lastSmaller) {
            // Skip duplicate numbers
            continue;
        } else if (sorted[i] === lastSmaller + 1) {
            // Continue the sequence
            cnt++;
        } else {
            // Sequence broken, reset count
            cnt = 1;
        }
        lastSmaller = sorted[i];
        longest = Math.max(longest, cnt);
    }
    
    return longest;
};
