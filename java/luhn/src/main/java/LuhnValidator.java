class LuhnValidator {

    boolean isValid(String candidate) {
        String cleanCandidate = "";
        if(candidate.replaceAll(" ","").length() < 2)
            return false;
        for(int i = 0; i < candidate.length(); i++){
            if(candidate.charAt(i) == ' ')
               continue;
            if(Character.getNumericValue(candidate.charAt(i)) < 10)
               cleanCandidate +=  candidate.charAt(i);
            else
                return false;
        }

        int result = 0;
        for(int j = 0; j< cleanCandidate.length(); j++){
            int value = Character.getNumericValue(cleanCandidate.charAt(j));
            if(j%2 == cleanCandidate.length()%2){
                if(value*2 > 9)
                    result += value*2 - 9;
                else
                    result += value*2; 
            } else
                result += value;
        }

        return result%10 == 0;
    }

}
