import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

public class Anagram{

    private final String word;

    public Anagram(String word){
        this.word = word.toLowerCase();
    }

    public List<String> match(List<String> wordTest){
        return wordTest.stream()
                        .filter(wordTested -> Arrays.equals(this.word.chars().sorted().toArray(),
                                wordTested.toLowerCase().chars().sorted().toArray())
                                && !this.word.equals(wordTested.toLowerCase()))
                       .collect(Collectors.toList());

    }
}