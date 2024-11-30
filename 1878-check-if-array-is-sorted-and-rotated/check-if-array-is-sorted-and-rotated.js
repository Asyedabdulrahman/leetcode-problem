var check = function(nums) {
    let count = 0;
    let num = nums.length;
    for(let i = 0; i < num; i++ ){
        if(nums[i+1] < nums[i]){
            count++;
        }
    }
    if(nums[nums.length - 1] > nums[0]){
        count++
    }
    return count < 2 ;  
};
