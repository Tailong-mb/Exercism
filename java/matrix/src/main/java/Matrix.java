import java.util.ArrayList;

class Matrix {

    private String stringMatrix;
    
    Matrix(String matrixAsString) {
        this.stringMatrix = matrixAsString;
    }

    int[] getRow(int rowNumber) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        int rowLevel = 2 - rowNumber;
        
        for(int i = 0; i < this.stringMatrix.length(); i++){
            String number = "";
            if(rowLevel == 1){
                if(this.stringMatrix.charAt(i) != ' ')
                    number += this.stringMatrix.charAt(i);
                if(!(i+1 == this.stringMatrix.length())){
                    if(this.stringMatrix.charAt(i+1) == ' '){
                    row.add(Integer.parseInt(number));
                    number = "";
                }
                } else 
                    row.add(Integer.parseInt(number));
            }else if(this.stringMatrix.charAt(i) == 'n')
                rowLevel += 1;
        }

        return row.stream().mapToInt(i -> i).toArray();
    }

    int[] getColumn(int columnNumber) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
