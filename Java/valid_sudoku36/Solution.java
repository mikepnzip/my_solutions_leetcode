import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    char digit = board[i][j];
                    if (rows[i].contains(digit)) {
                        return false;
                    }
                    rows[i].add(digit);

                    if (cols[j].contains(digit)) {
                        return false;
                    }
                    cols[j].add(digit);


                    int boxIdx = (i / 3) * 3 + j / 3;
                    if (boxes[boxIdx].contains(digit)) {
                        return false;
                    }
                    boxes[boxIdx].add(digit);
                }
            }
        }
        return true;
    }
}
