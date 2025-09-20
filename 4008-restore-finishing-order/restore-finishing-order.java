class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        int idx = 0;

        // if(order.length == 0 || friends.length == 0) return 0; // base case 
        for(int i = 0; i < order.length; i++){
            for(int j = 0; j < friends.length; j++){
                if(order[i] == friends[j]){
                    result[idx++] = order[i];
                }
            }
        }
        return result;
    }
}