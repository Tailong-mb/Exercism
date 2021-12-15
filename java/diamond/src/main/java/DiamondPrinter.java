import java.util.List;
import java.util.ArrayList;

class DiamondPrinter {
        final String alphabetString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        List<String> printToList(char a) {
        int lengthline = this.alphabetString.indexOf(Character.toUpperCase(a));
        // Test if char a is an alphabet character
        if(lengthline == -1)
        throw new IllegalArgumentException("Illegal character");

        List<String> diamond = new ArrayList<>();
        
        //Particular case
        if(lengthline == 0){
            diamond.add("A");
        } else {
            // Initialisation of the middle of the diamond
            lengthline = (lengthline)*2 + 1;
            int middlelengthline = (int)lengthline/2 +1;
            String diamondLine = "";

            for(int i = 0; i <lengthline; i++){
                if((i  == 0) || ( i == lengthline-1))
                    diamondLine += Character.toUpperCase(a);
                else 
                    diamondLine += " ";
            }
            
            
            diamond.add(diamondLine);
            // Build the rest of the diamond
            for(int j = 2; j < middlelengthline+1; j++){
                //Initialisation of the String
                diamondLine = "";
                for(int k = 0; k < lengthline ; k++){
                    if((k == j-1) || (k == lengthline - j))
                        diamondLine += this.alphabetString.charAt(middlelengthline - j);
                    else
                        diamondLine += " "; 
                }
            diamond.add(0,diamondLine);
            diamond.add(diamondLine);
            }
        }
        return diamond;
    }
}
