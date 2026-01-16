class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for(char arr : num.toCharArray()){
            while(!stack.isEmpty() && stack.peek() > arr && k > 0){
                stack.pop();
                k--;
            }
            stack.push(arr);
        }

        while(k > 0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        for(char ch : stack){
            sb.append(ch);
        }
        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}