/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let maxProfit = 0;
    let n = prices.length;
    let minPrice = Infinity;

    for(let i = 0; i < n; i++){
        if(prices[i] < minPrice){
            minPrice = prices[i];
        }

        profit = prices[i] - minPrice ;

        if(profit > maxProfit){
            maxProfit = profit;
        }
    }
    return maxProfit;
    
};