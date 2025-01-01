/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
    const n = matrix.length;
    if(n === 0) return 0;



    for(let i = 0; i < n; i++){
        for(let j = i + 1; j < n ;j++){
            [matrix[i][j], matrix[j][i]] = [matrix[j][i], matrix[i][j]];
        }
    }

    for(let i = 0; i < matrix.length; i++){
        matrix[i].reverse();
    }
    
    return matrix;
};