class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(nums, result, new boolean[nums.length], new ArrayList<>());
        return result;
    }

    private void backTrack(int[] nums, List<List<Integer>> result, boolean[] used, List<Integer> temp){
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < nums.length;i++){
            if(used[i]) continue;
            used[i] = true;
            temp.add(nums[i]);
            backTrack(nums, result, used, temp);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }


    }
}