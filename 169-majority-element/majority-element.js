/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let count = 0 ; 
    let majority = 0 ;
    for(let num of nums){
        if(count === 0){
            majority = num;
        }
        count+= (num === majority)? 1 : -1;
    }
    return majority;
};