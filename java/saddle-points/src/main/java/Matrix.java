import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

class Matrix {

    List<List<Integer>> matrix;

    Matrix(List<List<Integer>> values) {
        
        this.matrix = values;
    }

    Set<MatrixCoordinate> getSaddlePoints() {

        //Initialisation
        Set<MatrixCoordinate> result = new HashSet<>();
        int lengthLine = this.matrix.size();

        //Test if the matrix is empty
        if(lengthLine == 0)
            return result;
        
        int lengthColumn = this.matrix.get(0).size();
        
        for(int i = 0; i < lengthLine; i++){
            for(int j = 0; j <lengthColumn; j++){
                //Value tested
                int value = this.matrix.get(i).get(j);
                //Test with the column
                boolean isSaddle = true;
                for(int k = 0; k < lengthLine; k++){
                    if(this.matrix.get(k).get(j) < value)
                        isSaddle = false;
                }
                if(isSaddle){
                    isSaddle = true;
                    //Test with the line
                    for(int l = 0; l <lengthColumn; l++){
                        if(this.matrix.get(i).get(l) > value)
                            isSaddle = false;
                    }
                    if(isSaddle)
                    result.add(new MatrixCoordinate(i+1,j+1));
                }
            }
        }
    return result;
    }
}
