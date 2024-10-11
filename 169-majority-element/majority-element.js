/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let element = null
    let count = 0
    for(let i=0; i< nums.length; i++) {
        if(count === 0) {
            element = nums[i]
        }
        if(element === nums[i]) {
            count++
        } else {
            count--
        }
        
    }
    return element
};