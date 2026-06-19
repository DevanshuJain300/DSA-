class Solution {
    public String removeDuplicates(String s, int k) {
    int i = 0, n = s.length(), count[] = new int[n];
    char[] st = s.toCharArray();
    for (int j = 0; j < n; j++, i++){
        st[i] = st[j];
        if (i > 0 && st[i - 1] == st[j]) {
    count[i] = count[i - 1] + 1;
} else {
    count[i] = 1;
}
        if (count[i] == k) i = i - k;
    }
    return new String(st, 0, i);
    }
}