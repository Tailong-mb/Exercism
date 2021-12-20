import java.util.HashMap;
import java.util.Map;

public class WordCount{

    public Map<String, Integer> phrase(String phrase){

        Map<String, Integer> result = new HashMap<String, Integer>();

        for (String word : phrase.toLowerCase().split("\\s+|,")) {
            word = word.replaceAll("^\\p{Punct}+|\\p{Punct}+$", ""); 
            if (word.length() != 0){
                if(result.containsKey(word)){
                    int count = result.get(word)+1;
                    result.remove(word);
                    result.put(word,count);
                } else
                result.put(word,1);
            }
        }
        return result;
    }
}