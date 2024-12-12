/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    if(numbers.length < 0) return 0;
    let left = 0;
    let right = numbers.length - 1;

    while(left < right){
        let total = numbers[left] + numbers[right];
        if(total === target){
            return [left + 1, right + 1];
        }
        else if ( total > target){
            right--;
        }
        else{ 
            left++;
        }
    }
    
};