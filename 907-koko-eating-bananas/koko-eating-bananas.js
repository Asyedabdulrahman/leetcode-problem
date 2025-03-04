/**
 * @param {number[]} piles
 * @param {number} h
 * @return {number}
 */
var minEatingSpeed = function(piles, h) {
    let left = 1, right = Math.max(...piles);
    let res = right;

    while(left <= right){
        let k = (left + right) >> 1;
        let hours = 0;

        for(let p of piles){
            hours += Math.floor((p + k - 1) /k);
        }

        if(hours <= h){
            res = Math.min(res,k)
            right = k - 1;
        }
        else {
            left = k + 1;
        }
    }
    return res;
};