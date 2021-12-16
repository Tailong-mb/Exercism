import java.util.ArrayList;
import java.util.List;

public class Flattener{

    public List<Object> flatten(List<Object> list){
        List<Object> listClear = new ArrayList<Object>();
        for(Object listOfObject : list){
            if (listOfObject instanceof List)
                listClear.addAll(this.flatten((List) listOfObject));
            else if(listOfObject != null)
                listClear.add(listOfObject);
        }
        return listClear;
    }
}