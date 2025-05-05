class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int n = instructions.length;
        boolean [] seen = new boolean[n];
        long score = 0;
        int i = 0;

        while(i >= 0 && i < n && !seen[i]){
            seen[i] = true;
            String instr = instructions[i];
            int val = values[i];
            if("add".equals(instr)){
                score += val;
                i++;
            }
            else{
                i += val;
            }
        }
        return score;
        
    }
}