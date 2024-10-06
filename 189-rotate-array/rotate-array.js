/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    const n = nums.length;
    k = k % n;
    
    //reverse the entire array
    reverse(nums,0, n-1);

    //reverse the Kth array elements
    reverse(nums,0, k - 1);

    //reverse the above Kth array elements
    reverse(nums,k,n - 1);   
};

var reverse = function(arr,left, right){
    while (left < right){
        [arr[left], arr[right]] = [arr[right], arr[left]];
        left++;
        right--;
    }
}