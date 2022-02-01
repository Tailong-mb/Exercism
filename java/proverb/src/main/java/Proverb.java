class Proverb {

    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        String result = "";
        for(int i = 0; i < this.words.length-1; i++){
            result += String.format("For want of a %s the %s was lost.\n",this.words[i],this.words[i+1]);
        }

        if(this.words.length == 0)
            return "";
        else{
            result += String.format("And all for the want of a %s.",this.words[0]);
            return result;
        }
    }

}
