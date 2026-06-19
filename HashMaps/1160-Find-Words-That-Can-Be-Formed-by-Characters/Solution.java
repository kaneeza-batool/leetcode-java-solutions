class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charMap = new HashMap<>();
        
        for (char c : chars.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        int result = 0;

        for (String word : words) {
            Map<Character, Integer> wordMap = new HashMap<>();
            
            for (char ch : word.toCharArray()) {
                wordMap.put(ch, wordMap.getOrDefault(ch, 0) + 1);
            }

            boolean canForm = true;

            for (char ch : wordMap.keySet()) {
                if (wordMap.get(ch) > charMap.getOrDefault(ch, 0)) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                result += word.length();
            }
        }

        return result;
    }
}
