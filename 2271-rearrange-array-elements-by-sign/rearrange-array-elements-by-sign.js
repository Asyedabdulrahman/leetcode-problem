/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    let positive = 1;
    let negative = 0;
    let n = nums.length;
    let tempArray = new Array(n).fill(0);

    for(let i = 0; i < n; i++){
        if(nums[i] < 0){
            tempArray[positive] = nums[i];
            positive+=2;
        }
        else{
            tempArray[negative] = nums[i];
            negative+=2;
        }
    }
    return tempArray;
    
};