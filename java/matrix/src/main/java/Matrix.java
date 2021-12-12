class Matrix {
    
    int rows;
    int columns;
    int[][] matrix;
    
    Matrix(String matrixAsString) {
        String[] rows = matrixAsString.split("\\n");
        String[] columns = rows[0].split(" ");
        this.rows = rows.length;
        this.columns = columns.length;
        matrix = new int[this.rows][this.columns];
        for (int i = 0; i < rows.length; i++) {
            String[] number = rows[i].split(" ");
            for (int j = 0; j < number.length; j++) {
                matrix[i][j] = Integer.parseInt(number[j]);
            }
        }
    }
    
    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }
    
    int[] getColumn(int columnNumber) {
        int[] column = new int[this.rows];
        for (int i = 0; i < matrix.length; i++) {
            column[i] = matrix[i][columnNumber - 1];
        }
        return column;
    }
}