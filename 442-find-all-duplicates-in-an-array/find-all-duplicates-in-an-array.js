/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {
    const seen = new Set();
    const output = [];

    for(const num of nums){
        if(seen.has(num)){

            output.push(num);
        }
        else{
            seen.add(num);
        }
    }
    
    return output;
};