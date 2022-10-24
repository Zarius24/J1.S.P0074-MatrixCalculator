
public class InputAndOutputMatrix {

    Validation v = new Validation();

    public int[][] getMatrix1() {
        int row1 = v.checkInputRowAndColumn("Enter Row Matrix 1: ");
        int col1 = v.checkInputRowAndColumn("Enter Column Matrix 1: ");
        int[][] matrix1 = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = v.checkInputMatrix("Matrix 1", i, j);
            }
        }
        return matrix1;
    }

    public int[][] getMatrix2(int[][] matrix1, int choice) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2, col2;
        if (choice == 3) {
            while (true) {
                row2 = v.checkInputRowAndColumn("Enter Row Matrix 2: ");
                if (row2 == col1) {
                    break;
                } else {
                    System.err.println("Row 2 in matrix 2 must equal to Column 1 in matrix 1");
                }
            }
            col2 = v.checkInputRowAndColumn("Enter Column Matrix 2: ");
        } else {
            while (true) {
                row2 = v.checkInputRowAndColumn("Enter Row matrix 2: ");
                if (row2 == row1) {
                    break;
                } else {
                    System.err.println("Row 2 in matrix 2 must equal to Row 1 in matrix 1");
                }
            }
            while (true) {
                col2 = v.checkInputRowAndColumn("Enter Column matrix 2: ");
                if (col2 == col1) {
                    break;
                } else {
                    System.err.println("Column 2 in matrix 2 must equal to Column 1 in matrix 1");
                }
            }
        }

        int[][] matrix2 = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = v.checkInputMatrix("Matrix 2", i, j);
            }
        }
        return matrix2;
    }

    public void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void displayResult(int[][] matrix1, int[][] matrix2, int choice, int[][] result) {
        String expression = null;
        switch (choice) {
            case 1:
                expression = "+";
                break;
            case 2:
                expression = "-";
                break;
            case 3:
                expression = "*";
                break;
        }

        System.out.println("------- Result -------");
        displayMatrix(matrix1);
        System.out.println(expression);
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(result);
    }
}
