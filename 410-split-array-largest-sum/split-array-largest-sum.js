/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var splitArray = function(nums, k) {
    let left =Math.max(...nums);
    let right =nums.reduce((a,b)=>a+b,0);
    
    while(left<right){
        let mid=Math.floor((left+right)/2);
        let subarraySum=0;
         let subarrays =1;
        
        for(let i=0; i<nums.length; i++){
            subarraySum=subarraySum+nums[i];
            if(subarraySum>mid){
              subarrays++;
              subarraySum= nums[i];     
            }
            }
       
        if(subarrays<=k){
            right=mid;
        }else{
            left=mid+1;
        }
            
        }
      return left;    
};