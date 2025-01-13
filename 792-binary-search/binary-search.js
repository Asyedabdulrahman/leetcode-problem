/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    let n = nums.length; 

    for(let i = 0 ; i < n; i++){
        if(nums[i] == target){
            return i
        }
    }
    return -1;
};