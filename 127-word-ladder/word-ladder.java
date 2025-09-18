class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);

        if(!wordSet.contains(endWord)){
            return 0;
        }


        // bfd queue starting
        Queue<String> queue = new ArrayDeque<>();
        queue.offer(beginWord);

        int transformationSteps = 1;

        while(!queue.isEmpty()){
            int currentLevelSize = queue.size();

            for(int i = 0; i < currentLevelSize; i++){
                String currentWord = queue.poll();
                char[] charArray = currentWord.toCharArray();

                for(int charIndex = 0; charIndex < charArray.length; charIndex++){
                    char originalChar = charArray[charIndex];

                    for(char newChar = 'a'; newChar <= 'z'; newChar++){
                        if(newChar == originalChar) continue;

                        charArray[charIndex] = newChar;
                        String transformedWord = new String(charArray);

                        if(endWord.equals(transformedWord)){
                            return transformationSteps + 1;
                        }

                        if(wordSet.contains(transformedWord)){
                            queue.offer(transformedWord);
                            wordSet.remove(transformedWord);
                        }
                    }
                    charArray[charIndex] = originalChar;
                }
            }
            transformationSteps++;

        }
        return 0;
    }
}