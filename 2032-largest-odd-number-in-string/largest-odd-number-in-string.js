/**
 * @param {string} num
 * @return {string}
 */
var largestOddNumber = function(num) {
    let lastoddindex = -1;
    for(let i = num.length - 1 ; i >= 0; i--){
    if(num[i] % 2 === 1){
        lastoddindex = i;
        break;
    }
   }   
   return lastoddindex === -1 ? "" : num.substring(0, lastoddindex + 1);
};