/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function(matrix) {
    let n = matrix.length;
    let m = matrix[0].length;
    let row = new Array(n).fill(0);
    let column = new Array(m).fill(0);

    for(let i = 0; i < n; i++){
        for(let j = 0 ; j < m; j++){
            if(matrix[i][j] === 0){
                row[i] = 1;
                column[j] = 1;
            }
        }
    }


    for(let i = 0 ; i < n; i++){
        for(let j =0; j < m; j++){
          if(row[i] || column[j] == 1){
            matrix[i][j] = 0;
            }
        }
    }
    return matrix;
};