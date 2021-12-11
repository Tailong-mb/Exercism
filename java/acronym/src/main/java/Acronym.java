class Acronym {

    private String acronymOf;
    
    Acronym(String phrase) {
        final StringBuilder acronymPhrase = new StringBuilder();
        boolean putNewLetter = true;

        for(int i = 0; i < phrase.length() ; i++){
            final char charPhrase = phrase.charAt(i);
            if((putNewLetter) && (Character.compare(charPhrase,'-') !=  0) && (Character.compare(charPhrase,'_') !=  0) && (Character.compare(charPhrase,' ') !=  0)){
                acronymPhrase.append(Character.toUpperCase(charPhrase));
                putNewLetter = false;
            }
            if((Character.compare(charPhrase,' ') ==  0) || (Character.compare(charPhrase,'-') ==  0))
                putNewLetter = true;
        }        

        this.acronymOf = acronymPhrase.toString();
    }

    String get() {
        return this.acronymOf;
    }

}
