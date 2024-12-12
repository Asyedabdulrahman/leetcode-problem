/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {
    const output = [];

    for(const num of nums){
        const idx = Math.abs(num) - 1 ;

        //check if the value at the calculated index is negative
        if(nums[idx] < 0){
            output.push(Math.abs(num));
        }
        else{
            nums[idx] = -nums[idx];
        }
    }
    return output;
    
};