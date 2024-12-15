/**
 * @param {number[]} nums
 * @return {number}
 */
    var longestConsecutive = function(nums) {
    const set = new Set(nums);  // Add all numbers to a set for O(1) lookups
    let longest = 0;
    
    for (let num of set) {
        // Check if it is the start of a sequence
        if (!set.has(num - 1)) {
            let currentNum = num;
            let currentStreak = 1;

            // Check the sequence of consecutive numbers starting from 'num'
            while (set.has(currentNum + 1)) {
                currentNum++;
                currentStreak++;
            }

            // Update the longest streak found
            longest = Math.max(longest, currentStreak);
        }
    }
    
    return longest;
};


