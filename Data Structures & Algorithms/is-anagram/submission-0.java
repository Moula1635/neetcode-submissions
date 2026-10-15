class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char[] oneSet = s.toCharArray();
        char[] twoSet = t.toCharArray();

        Arrays.sort(oneSet);
        Arrays.sort(twoSet);
        return Arrays.equals(oneSet, twoSet);
        
    }
}
