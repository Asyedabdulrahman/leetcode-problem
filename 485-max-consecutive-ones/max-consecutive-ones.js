/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let count = 0 ; 
    let check = 0; 
    for(let i = 0; i < nums.length; i++){
        if(nums[i] === 1){
            check++;
        }
        else{
            check = 0;
        }
        if(check > count)
        count = check;
    }
    return count;

    
};