class Solution {
    public int reverse(int x) {

        long ans = 0;

        while (x != 0) {

            int digit = x % 10;

            x = x / 10;

            // Check overflow before multiplying by 10
            if (ans > Integer.MAX_VALUE / 10 ||
                ans < Integer.MIN_VALUE / 10) {
                return 0;
            }

            ans = ans * 10 + digit;
        }

        return(int) ans;
    }
}