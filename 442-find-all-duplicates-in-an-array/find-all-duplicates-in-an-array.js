/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {
    let max = [];
    let seen = new Set();


    for(const num of nums){
        if(seen.has(num)){
            max.push(num);
        }
        else{
            seen.add(num);
        }
    }
    return max;
    
};