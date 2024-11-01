/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let numswithindex = nums.map((num,index)=> [num,index]);
    numswithindex.sort((a,b) => a[0] - b[0]);

    let left = 0;
    let right = numswithindex.length - 1;

    while(left < right) {
        let sum = numswithindex[left][0] + numswithindex[right][0];
        if(sum == target) { 
            return [numswithindex[left][1] , numswithindex[right][1]];
        }
        else if(sum < target){
            left++
        }
        else{
            right--
        }
    }
    return [];
    
};
