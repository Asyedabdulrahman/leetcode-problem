/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function(matrix) {
    const zeros = []
    const rowSet = new Set()
    const colSet = new Set()
    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] === 0) zeros.push([i, j])
        }
    }
    const rowSeen = new Set()
    const colSeen = new Set()
    for (const zero of zeros) {
        if (!rowSeen.has(zero[1])) {
            for (let i = 0; i < matrix.length; i++) matrix[i][zero[1]] = 0
            rowSeen.add(zero[1])
        }
        if (!colSeen.has(zero[0])) {
            for (let i = 0; i < matrix[0].length; i++) matrix[zero[0]][i] = 0
            colSeen.add(zero[0])
        } 
    }
};