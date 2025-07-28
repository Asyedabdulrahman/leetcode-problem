import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];

        // 1. Convert to string
        for(int i = 0; i < nums.length; i++){
            strNums[i] = String.valueOf(nums[i]);
        }

        // 2. Sort using custom comparator
        Arrays.sort(strNums, new Comparator<String>(){
            public int compare(String a , String b){
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // descending
            }
        });

        // 3. Edge case: if the largest is "0", return "0"
        if(strNums[0].equals("0")) return "0";

        // 4. Join the result
        StringBuilder sb = new StringBuilder();
        for(String num : strNums){
            sb.append(num);
        }

        return sb.toString();
    }
}
