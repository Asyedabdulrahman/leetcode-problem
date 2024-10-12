/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    let n = nums.length;
    let tempArray = new Array(n).fill(0);
    let positive = 0; negative = 1;
     
    for(let i = 0; i < n; i++){
        if(nums[i] < 0){
        tempArray[negative]  = nums[i];
        negative += 2;
    }
    else{
      tempArray[positive] = nums[i];
      positive += 2;
    }
  } 
  return tempArray;
    
};