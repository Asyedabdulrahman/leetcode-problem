var subarraySum = function (nums, k) {
    const cache = new Map();
    cache.set(0, 1);
    let count = 0;
    let sum = 0;
    for (let i = 0; i < nums.length; i++) {
        sum += nums[i];
        let d = sum - k;
        if (cache.has(d)) {
            count += cache.get(d);
        }
        cache.set(sum, (cache.get(sum) ?? 0) + 1);
    }
    return count;
};