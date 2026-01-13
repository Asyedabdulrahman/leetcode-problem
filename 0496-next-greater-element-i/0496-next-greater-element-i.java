class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();

        int nums1Length = nums1.length;
        int nums2Length = nums2.length;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = nums2Length - 1; i >= 0; i--){
            int currentValue = nums2[i];

            while(!stack.isEmpty() && stack.peek() < currentValue){
                stack.pop();
            } 

            if(!stack.isEmpty()){
                map.put(currentValue, stack.peek());
            }

            stack.push(currentValue);
        }

        int[] result = new int[nums1Length];
        for(int i = 0; i < nums1Length; i++){
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}