/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
    if(nums.length < 0) return 0;
    let result = 0;
    let sum = 0;
    const map = new Map();
    map.set(0, 1);
    for (let i = 0; i < nums.length; i += 1) {
        sum += nums[i];
        const remove = sum - k;
        result += map.get(remove) || 0;
        map.set(sum, (map.get(sum) || 0) + 1);
    }
    return result;
};