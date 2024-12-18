/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
     const n = matrix.length;

        // Transpose the matrix
        for (let i = 0; i < n; i++) {
            for (let j = i + 1; j < n; j++) {
                [matrix[i][j], matrix[j][i]] = [matrix[j][i], matrix[i][j]]; // Swap using destructuring
            }
        }

        // Reverse each row
         for (let i = 0; i < matrix.length; i++) {
             matrix[i].reverse();
    }
    
};