var findMedianSortedArrays = function(nums1, nums2) {
    let s = [...nums1,...nums2]
    s.sort((a,b)=>a-b)
    if(s.length%2==0){
        return (s[(s.length/2)-1]+s[s.length/2])/2
    }else{
        return s[Math.floor(s.length/2)]
    }
};