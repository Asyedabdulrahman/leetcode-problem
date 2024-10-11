/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let n = nums.length;
    let cnt = 0; 
    let ele = 0;

    //find the suitable candidate for majority element finding 
    for(let i = 0 ; i < n; i++){
        if(cnt === 0){
            cnt = 1;
            ele = nums[i];
        }
        else if (nums[i] === ele){
            cnt++;
        }
        else{
            cnt--;
        }
    }

    //finding the majority element based on element selection 

    let cnt1 = 0;
    for(let i = 0;  i < n; i++){
        if(nums[i] === ele){
            cnt1++;
        }
    }

    if(cnt1 > Math.floor(n/2)){
        return ele
    }
    else{
        return -1
    }
    
};