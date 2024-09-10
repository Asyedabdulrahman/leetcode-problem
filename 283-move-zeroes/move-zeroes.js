/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    let left = 0 ; 
    if(nums.length == 0) return ; 
    //base case is written above
    //logic was written below

    for(let i = 0; i < nums.length; i++){
        if(nums[i] !== 0){
            [nums[i], nums[left]] = [nums[left], nums[i]];
            left++;
        }
    }
    return nums;
};