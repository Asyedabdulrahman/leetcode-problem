/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    let result = s.trim().split(/\s+/).reverse().join(" ");
    return result;
};