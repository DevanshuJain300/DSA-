class Solution {

    private String build(String str) {
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch != '#') {
                st.push(ch);
            } else if (!st.isEmpty()) {
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : st) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
}