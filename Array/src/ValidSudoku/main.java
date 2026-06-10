package ValidSudoku;

import java.util.*;

public class main {

    public main(String[] args) {
        char[][] board;
        try (Scanner sc = new Scanner(System.in)) {
            board = new char[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    board[i][j] = sc.next().charAt(0);
                }
            }
        }
        if (isValidSudoku(board)) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
    }

    public static boolean checks(char[][] board, int row, int col) {
        HashSet<Character> bset = new HashSet<>();
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                char c = board[row + i][col + j];
                if (c != '.') {
                    if (bset.contains(c)) {
                        return false;
                    } else {
                        bset.add(c);
                    }
                }
            }
        }

        return true;
    }

    public static boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;

//       for row frist
        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < m; j++) {
                char c = board[i][j];
                if (c != '.') {

                    if (set.contains(c)) {
                        return false;
                    } else {
                        set.add(c);
                    }
                }
            }

//        coloum set
            for (int k = 0; k < m; k++) {
                HashSet<Character> cset = new HashSet<>();
                for (int j = 0; j < n; j++) {
                    char c = board[k][i];
                    if (c != '.') {
                        if (cset.contains(c)) {
                            return false;
                        } else {
                            cset.add(c);
                        }
                    }
                }
            }

            for (int t = 0; t < n; t += 3) {
                for (int f = 0; f < m; f += 3) {
                    checks(board, t, f);
                }
            }

        }
        return true;
    }

}
