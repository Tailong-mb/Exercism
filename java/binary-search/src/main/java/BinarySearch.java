import java.util.List;

public class BinarySearch<T extends Comparable>{
    
    private List<T> allElements;

    public BinarySearch(List<T> listOfElements){
        this.allElements = listOfElements;
    }
    

    public int indexOf(T element) throws ValueNotFoundException{
        return indexSearch(0, this.allElements.size()-1,element);
    }

    public int indexSearch(int leftBorder,int rightBorder, T element) throws ValueNotFoundException{

        if(leftBorder > rightBorder){
            throw new ValueNotFoundException("Value not in array");
        }
        int middle = (int)(leftBorder + rightBorder)/2;
        T value = this.allElements.get(middle);

        int compare = value.compareTo(element);
        if(compare == 0){
            return middle;
        }else if (compare >0){
            return indexSearch(leftBorder, middle-1, element);
        }else{
            return indexSearch(middle+1, rightBorder, element);
        }

    }
}