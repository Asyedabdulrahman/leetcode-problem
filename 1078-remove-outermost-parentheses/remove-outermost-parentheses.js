/**
 * @param {string} s
 * @return {string}
 */
var removeOuterParentheses = function(s) {
    let counter = 0;
    let result = "";

    for(let i = 0; i < s.length; i++){
        if(s[i] === "("){
            if(counter){
                result += s[i];
            }
            counter++;
        }
        else {
            counter--;
            if(counter){
                result += s[i];
            }
        }
    }
    return result;
};