/*
Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose. Also finding the determinant and inverse of a matrix. The program should take random matrices as input and display the result of the operations.
Hint =>
Write a Method to create a random matrix taking rows and columns as parameters
Write a Method to add two matrices
Write a Method to subtract two matrices
Write a Method to multiply two matrices
Write a Method to find the transpose of a matrix
Write a Method to find the determinant of a 2x2 matrix
Write a Method to find the determinant of a 3x3 matrix
Write a Method to find the inverse of a 2x2 matrix
Write a Method to find the inverse of a 3x3 matrix
Write a Method to display a matrix
*/

package CoreProgramming.Methods.Level3;

class MatrixOperations {

    // Creates a matrix with random values
    static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];

        // Loop to fill matrix with random numbers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 9) + 1;
            }
        }
        return matrix;
    }

    // Adds two matrices
    static double[][] add(double[][] a, double[][] b) {
        double[][] r = new double[a.length][a[0].length];

        // Loop to add corresponding elements
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                r[i][j] = a[i][j] + b[i][j];
            }
        }
        return r;
    }

    // Subtracts two matrices
    static double[][] subtract(double[][] a, double[][] b) {
        double[][] r = new double[a.length][a[0].length];

        // Loop to subtract corresponding elements
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                r[i][j] = a[i][j] - b[i][j];
            }
        }
        return r;
    }

    // Multiplies two matrices
    static double[][] multiply(double[][] a, double[][] b) {
        double[][] r = new double[a.length][b[0].length];

        // Triple loop for matrix multiplication
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    r[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return r;
    }

    // Finds transpose of a matrix
    static double[][] transpose(double[][] m) {
        double[][] t = new double[m[0].length][m.length];

        // Loop to swap rows and columns
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                t[j][i] = m[i][j];
            }
        }
        return t;
    }

    // Calculates determinant of 2x2 matrix
    static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Calculates determinant of 3x3 matrix
    static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Finds inverse of 2x2 matrix
    static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }

    // Finds inverse of 3x3 matrix
    static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2]) / det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2]) / det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2]) / det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1]) / det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    // Displays a matrix in formatted form
    static void display(double[][] m) {

        // Loop to print matrix elements
        for (double[] row : m) {
            for (double val : row) {
                System.out.printf("%6.2f ", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create two random 3x3 matrices
        double[][] A = createRandomMatrix(3, 3);
        double[][] B = createRandomMatrix(3, 3);

        System.out.println("Matrix A");
        display(A);

        System.out.println("Matrix B");
        display(B);

        System.out.println("A + B");
        display(add(A, B));

        System.out.println("A - B");
        display(subtract(A, B));

        System.out.println("A * B");
        display(multiply(A, B));

        System.out.println("Transpose of A");
        display(transpose(A));

        System.out.println("Determinant of A (3x3): " + determinant3x3(A));

        double[][] invA = inverse3x3(A);
        if (invA != null) {
            System.out.println("Inverse of A");
            display(invA);
        } else {
            System.out.println("Inverse of A does not exist");
        }
    }
}
