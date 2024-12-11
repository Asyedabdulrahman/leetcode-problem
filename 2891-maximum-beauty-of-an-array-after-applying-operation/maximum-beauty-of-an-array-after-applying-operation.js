/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var maximumBeauty = function(nums, k) {
    nums.sort((a,b) => a-b)
    if(nums.length === 1) {
        return 1;
    }

    let i = 0;
    let res = 0;
    for (let j = 1; j < nums.length; j++) {
        if(nums[j] - nums[i] > 2*k) {
            i++;
        }
        res = Math.max(res, j-i+1)

    }
    return res;
};