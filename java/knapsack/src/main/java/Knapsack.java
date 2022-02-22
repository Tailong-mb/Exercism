import java.util.List;
import java.util.ArrayList;

public class Knapsack{

    public int maximumValue(int capacity, List<Item> items) {
        if(items.isEmpty()){
            return 0;
        }
        if (items.size() == 1) {
            if (items.get(0).getWeight() <= capacity) 
                return items.get(0).getValue();
            else
                return 0;
        }
        int result = 0;
        for(Item testItem : items){
            if(testItem.getWeight() > capacity)
                break;
            ArrayList<Item> newItems = new ArrayList<Item>(items);
            newItems.remove(testItem);
            int testValue = testItem.getValue() + maximumValue(capacity - testItem.getWeight(),newItems);
            if(testValue > result)
                result = testValue;
        }
        return result;
    }
}