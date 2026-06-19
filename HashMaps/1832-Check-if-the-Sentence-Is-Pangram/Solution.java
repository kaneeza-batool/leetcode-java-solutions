class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        char[] s = sentence.toCharArray();

        for (int i=0; i<sentence.length(); i++) {
            set.add(s[i]);
        }

        return set.size() == 26;
        
    }
}
