/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
     let result = [];
    let currentRow = [1];

    for (let i = 0; i < numRows; i++) {
        result.push([...currentRow]); // Store the current row
        for (let j = i; j > 0; j--) {
            currentRow[j] = (currentRow[j] || 0) + currentRow[j - 1];
        }
        currentRow.push(1);
    }

    return result;
    
};