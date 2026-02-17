package GyMCOmplete;

class SetMatriXZero {
    public void setZeroes(int[][] matrix) {


        boolean[][] state = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    state[i][j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (state[i][j] == true) {
                    matrix[i - 1][j] = 0;
                    matrix[i][j - 1] = 0;
                    matrix[i + 1][j] = 0;
                    matrix[i][j + 1] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}