var splitArray = function(nums, k) {
    let l = Math.max(...nums), r = nums.reduce((a, b) => a + b, 0);
    const n = nums.length;
    if (n === k) return l;

    let ans = 0;
    while (l <= r) {
        let m = Math.floor((l + r) / 2);
        let tempSum = 0, cnt = 0;
        for (let i = 0; i < n; i++) {
            if (tempSum + nums[i] <= m) {
                tempSum += nums[i];
            } else {
                cnt++;
                tempSum = nums[i];
            }
        }
        cnt++;

        if (cnt <= k) {
            ans = m;
            r = m - 1;
        } else {
            l = m + 1;
        }
    }
    return ans;
};