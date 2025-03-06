/**
 * @param {number[]} piles
 * @param {number} h
 * @return {number}
 */
var minEatingSpeed = function(piles, h) {
    let left = 0; right = Math.max(...piles);
    let res = right;

    while (left <= right){
        let hours = 0;
        let k = Math.floor((left + right) / 2);

        for(let pile of piles){
            hours += Math.ceil(pile / k);
        }

        if(hours <= h){
            res = Math.min(res,k);
            right = k - 1;
        }
        else {
            left = k + 1;
        }
    }
    return res;    
};