/**
 * @param {string} s
 * @return {string}
 */
var removeOuterParentheses = function(s) {
    let stack = [];
    let result = "";
    for(const S of s){
        if(S === "("){
            if(stack.length){
                result += S;
            }
            stack.push(S);
        }
        else {
            stack.pop();
            if(stack.length){
                result += S;
            }
        }

    }
    return result;
};