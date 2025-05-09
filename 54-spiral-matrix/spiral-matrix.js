/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
    // if (!matrix.length && !matrix[0].length) return [];
    let n = matrix.length; 

    let top = 0; 
    let left = 0;
    let right = matrix[0].length - 1;
    let bottom = matrix.length - 1;
    let array = [];


    while(top <= bottom && left <= right){
        for(let i = left; i <= right; i++){
            array.push(matrix[top][i]);
        }
        top++;

        for(let i = top; i <= bottom ; i++){
            array.push(matrix[i][right]);
        }
        right--;

        if(top <= bottom){
            for(let i = right; i >= left; i--){
                array.push(matrix[bottom][i]);
            }
        bottom--;
        }

        if(left <= right){
            for(let i = bottom; i >= top; i--){
                array.push(matrix[i][left]);
            }
            left++;
        }
    }
    return array;
};