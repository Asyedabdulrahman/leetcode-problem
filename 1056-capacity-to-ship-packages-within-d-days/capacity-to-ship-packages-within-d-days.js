/**
 * @param {number[]} weights
 * @param {number} days
 * @return {number}
 */
var shipWithinDays = function(weights, days) {
    if (weights.length === 0) return 0; // Base Case: No packages to ship
    if (days === 1) return weights.reduce((a, b) => a + b); // Must ship everything in 1 day
    if (days >= weights.length) return Math.max(...weights); // Each package can be shipped alone

    let left = Math.max(...weights);
    let right = weights.reduce((a,b) => a + b);

    while(left < right){
        let mid = Math.floor((left + right) / 2);
        let needed = 1;
        let current = 0;
        for(let i = 0; i < weights.length; i++){
            if(current + weights[i] > mid ){
                needed++;
                current = weights[i];
            }
            else {
                current += weights[i];
            }
        }

        if(needed > days){
            left = mid + 1;
        }
        else {
            right = mid;
        }
    }
    return left;
};