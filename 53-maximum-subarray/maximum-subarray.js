/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let sum = 0; 
    let n = nums.length;
    let maxi = Number.MIN_SAFE_INTEGER;


    for(let i = 0 ; i < n; i++){
        sum += nums[i];
        
        if(sum > maxi ){
        maxi = sum;
    }
    
    if (sum < 0){
        sum = 0;
    }
} 

    return maxi;
};