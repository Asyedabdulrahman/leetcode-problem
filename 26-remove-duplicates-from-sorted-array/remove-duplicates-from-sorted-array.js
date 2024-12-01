/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    if(nums.length === 0) return 0;
    let duplicate = 1;
    for(let i = 1; i < nums.length; i++){
        if(nums[i] !== nums[i-1]){
            nums[duplicate] = nums[i];
            duplicate++;
        }
    }
    return duplicate;
};