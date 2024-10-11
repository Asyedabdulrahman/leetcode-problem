/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let cnt=0,n=nums.length,ele=0;
    for(let i=0;i<n;i++){
        if(cnt==0){
            cnt=1;
            ele=nums[i];
        }
        else if(nums[i]==ele) cnt++;
        else cnt--;
    }
    return ele;
};