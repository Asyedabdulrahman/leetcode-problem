class Solution {
    class Pair{
        String s;
        int n;
        Pair(String s, int n){
            this.s = s;
            this.n = n;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        Queue<Pair> q = new LinkedList<>();
         q.offer(new Pair(beginWord,1));

         for(int i=0; i<wordList.size(); i++){
            set.add(wordList.get(i));
         }

         set.remove(beginWord);
         while(!q.isEmpty()){
            Pair curr = q.poll();
            String word = curr.s;
            int steps = curr.n;

            if(word.equals(endWord)){
                return steps;
            }

            for(int i=0; i<word.length(); i++){
                for(char c = 'a'; c<='z'; c++){
                    char[] wordToCharArray = word.toCharArray();
                     wordToCharArray[i] = c;
                    String replacedWord = new String(wordToCharArray);
                    if(set.contains(replacedWord)){
                        q.offer(new Pair(replacedWord,steps+1));
                        set.remove(replacedWord);
                    }
                }
            }
            
        }

         return 0;
    }
}