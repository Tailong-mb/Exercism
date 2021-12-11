import java.util.Arrays;
import java.util.stream.Collectors;

public class PangramChecker {

    public boolean isPangram(String input) {
        
        final StringBuilder cleanInput = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            final char charInPut = input.charAt(i);
           
            if (charInPut >= 'α' && charInPut <= 'ω') {
            } else if (Character.isAlphabetic(charInPut)) {
                cleanInput.append(charInPut);
            }
        }

        

        return Arrays.stream(cleanInput
                             .toString()
                             .toLowerCase()
                             .replaceAll("[^a-z]", "")
                             .split(""))
                     .collect(Collectors.toSet())
                     .size() == 26;
    }

}
