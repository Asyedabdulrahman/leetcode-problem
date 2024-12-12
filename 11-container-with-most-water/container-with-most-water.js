/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let maxArea = 0;
    let i = 0;
    let j = height.length - 1;

    while(i < j){
        let curWidth = j - i;
        let curheight = Math.min(height[i], height[j]) * curWidth;

        if(curheight > maxArea){
            maxArea = curheight;
        }
       
        if(height[i] <= height[j] ){
            i++;
        }
        else{
            j--;
        }
    }
    return maxArea;
    
};