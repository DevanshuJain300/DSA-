class Solution {

    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == word.charAt(0)) {

                    if (backtrack(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean backtrack(char[][] board, String word,
                             int i, int j, int index) {

        // Word found
        if (index == word.length()) {
            return true;
        }

        // Out of bounds
        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length) {
            return false;
        }

        // Wrong character
        if (board[i][j] != word.charAt(index)) {
            return false;
        }

        // Mark visited
        char temp = board[i][j];
        board[i][j] = '#';

        // Explore 4 directions
        boolean found =
            backtrack(board, word, i + 1, j, index + 1) ||
            backtrack(board, word, i - 1, j, index + 1) ||
            backtrack(board, word, i, j + 1, index + 1) ||
            backtrack(board, word, i, j - 1, index + 1);

        // Undo / backtrack
        board[i][j] = temp;

        return found;
    }
}