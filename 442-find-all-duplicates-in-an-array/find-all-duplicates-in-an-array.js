/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {
    let max = [];
    let seen = new Set();

    if(nums.length < 0) return 0;
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