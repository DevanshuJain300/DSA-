class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();

        String[] arr = s.split(" ");

        if (arr.length != pattern.length()) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            char ch = pattern.charAt(i);
            String word = arr[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            }
             else {
                
                if (map.containsValue(word)) {
                    return false;
                }
                map.put(ch, word);
            }
        }

        return true;
    }
}