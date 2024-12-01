/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let maxProfit = 0;
    let minPrice = Infinity;

    //for loop to iterate through the array to find the min price to buy the stock
    for(let i = 0; i < prices.length;i++){
        if(prices[i] < minPrice){
            minPrice = prices[i];
        }

        let profit = prices[i] - minPrice;

        if(profit > maxProfit){
            maxProfit = profit;
        }
    }
    return maxProfit;
    
};