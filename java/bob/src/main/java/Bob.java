public class Bob{

    public String hey(String phrase){
        phrase = phrase.trim().replaceAll("\n\t\r", "");
        if (phrase.equals(""))
            return "Fine. Be that way!";
            
        String lastElement = phrase.substring(phrase.length() - 1);
        
        if(phrase.equals(phrase.toUpperCase()) && phrase.matches(".*[a-zA-Z]+.*")){
            if(lastElement.equals("?"))
                return "Calm down, I know what I'm doing!";
            else
                return "Whoa, chill out!";
        } else if (lastElement.equals("?")){
            return "Sure.";
        } else {
            return "Whatever.";
        }
    }
}
