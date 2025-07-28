class Solution {
    public String largestNumber(int[] nums) {
        String[] newString = new String[nums.length];

        //converting to string
        for(int i = 0; i < nums.length; i++){
            newString[i] = String.valueOf(nums[i]);
        }


        //sorting the value from newString and implement custom comparator
        Arrays.sort(newString, new Comparator<String>(){
            public int compare(String a , String b){
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // it will compare by using ASCII value for string
            }
        });

        //edge case: if the largest is 0
        if(newString[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for(String num : newString){
            sb.append(num);
        }

        return sb.toString();
    }
}