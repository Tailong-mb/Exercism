import java.util.ArrayList;
import java.lang.Character;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        boolean result = true;
        ArrayList<Character> characterUsed = new ArrayList<Character>();
        for(int i =0; i < phrase.length(); i++){
            char test = Character.toLowerCase(phrase.charAt(i));
            if(characterUsed.indexOf(test) != -1){
                result = false;
            } else if ((test == '-') || (test == ' ')){
                continue;
            }else{
                characterUsed.add(test);
            }
        }
        return result;
    }

}
