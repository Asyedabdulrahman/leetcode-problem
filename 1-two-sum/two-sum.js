/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
  let numswithIndex = nums.map((num,index) => [num,index]);
  numswithIndex.sort((a,b) => a[0] - b[0]);


  let left = 0; 
  let right = numswithIndex.length - 1 ;

  while(left < right) {
    let sum = numswithIndex[left][0] + numswithIndex[right][0];
    if(sum == target) { 
        return [numswithIndex[left][1] , numswithIndex[right][1]];
    }
    else if (sum < target){
        left++;
    }
    else{ 
        right--;
    }
  }
  return [];
};
