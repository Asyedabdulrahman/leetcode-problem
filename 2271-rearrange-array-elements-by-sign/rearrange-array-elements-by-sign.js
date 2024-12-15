/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    let n = nums.length;
    if(n == 0) return 0;//base case
    let tempArray = new Array(n).fill(0);
    let positive = 1, negative = 0

    for(let i = 0; i < n; i++){
        if(nums[i] < 0){
            tempArray[positive] = nums[i];
            positive+= 2;
        }
        else{
            tempArray[negative] = nums[i];
            negative+= 2;
        }
    }
    return tempArray;
};