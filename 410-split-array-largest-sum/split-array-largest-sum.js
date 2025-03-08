/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var splitArray = function(nums, k) {
    let l = Math.max(...nums);
    let r = nums.reduce((a,b) => a + b, 0 );
    let n = nums.length;
    if(n === k) return l;

    let ans = 0;
    while(l <= r){
        let m = Math.floor((l + r) / 2);
        let tempsum = 0, cnt = 0;
        for(let i = 0; i < n; i++){
            if(tempsum + nums[i] <= m){
                tempsum += nums[i];
            }
            else {
                cnt++;
                tempsum = nums[i];
            }
        }
        cnt++;
    
    if(cnt <=k){
        ans = m;
        r = m - 1;
    }
    else {
        l = m + 1;
    }
    }
    return ans;
};