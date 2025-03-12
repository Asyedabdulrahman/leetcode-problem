/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    if(s.length < 1) return 0; //base case
    let result = s.trim().split(/\s+/).reverse().join(" ");
    return result;
};