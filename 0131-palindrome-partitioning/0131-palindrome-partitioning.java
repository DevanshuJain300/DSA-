class Solution {

    List<List<String>> ans = new ArrayList<>();
    List<String> sublist=new ArrayList<>();

    public List<List<String>> partition(String s) {

        backtrack(s, 0, sublist);

        return ans;
    }

    public void backtrack(String s, int index,
                           List<String> subList) {

        // Entire string is used
        if (index == s.length()) {
            ans.add(new ArrayList<>(subList));
            return;
        }

        for (int i = index; i < s.length(); i++) {

            // Take substring from index to i
            String str = s.substring(index, i + 1);

            // Check palindrome
            if (isPalindrome(str)) {

                // Pick
                subList.add(str);

                // Recurse
                backtrack(s, i + 1, subList);

                // Undo
                subList.remove(subList.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}