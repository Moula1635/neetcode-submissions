class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramList = new HashMap<>();
        for(String word: strs){
            char[] wordArray = word.toLowerCase().toCharArray();
            Arrays.sort(wordArray);
            String newWord = new String(wordArray);
            anagramList.computeIfAbsent(newWord, k -> new ArrayList<>()).add(word);

        }
        return new ArrayList<>(anagramList.values());
    }
}
