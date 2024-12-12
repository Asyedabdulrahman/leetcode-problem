/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let maxArea = 0;
    let i = 0, j = height.length - 1;

    while(i < j){
        const curWidth = j - i;
        const curHeight = Math.min(height[i], height[j]);
        maxArea = Math.max(maxArea, curWidth * curHeight);

        if(height[i] <= height[j]){
            i++;
        }
        else{
            j--;
        }
    }
    return maxArea;
};