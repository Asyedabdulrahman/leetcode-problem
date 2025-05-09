/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    if(nums.length === 0) return 0;
    nums.sort((a,b) => a - b);
    let result = []; //store the 3sum value result

    for(let i = 0; i < nums.length; i++){
        if( i > 0 && nums[i] === nums[i - 1]){
            continue; // if the past and present value are same, want to skip and move forward
        }
        let j = i + 1;
        let k = nums.length - 1;

        while(j < k){
            const sum = nums[i] + nums[j] + nums[k];
            if(sum === 0){
                result.push([nums[i], nums[j], nums[k]]);
                j++;
                k--;
                while(j < k && nums[j] === nums[j - 1]) j++;
                while(j < k && nums[k] === nums[k + 1]) k--;
            }
            else if (sum < 0){
                j++;
            }
            else{
                k--;
            }
        }
    }
    return result;
};