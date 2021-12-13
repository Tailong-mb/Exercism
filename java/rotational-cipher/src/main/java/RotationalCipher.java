class RotationalCipher {
    
    final String character ="abcdefghijklmnopqrstuvwxyz";
    int shiftKey;
    
    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
      if(this.shiftKey == 0){
          return data;
      }else{
          String finalString = "";
          for(int i = 0; i < data.length() ; i++){
              boolean upperCase = false;
              if(this.character.indexOf(Character.toLowerCase(data.charAt(i))) != -1){
                  if(this.character.indexOf(data.charAt(i)) == -1){
                      upperCase = true;
                  }
                    int charNumber = this.character.indexOf(Character.toLowerCase(data.charAt(i)));
                    charNumber = (this.shiftKey + charNumber)%26;
                  if(upperCase)
                    finalString += Character.toUpperCase(this.character.charAt(charNumber));
                  else
                    finalString += this.character.charAt(charNumber);
              }else{
                  finalString += data.charAt(i);
              }
          }
             return finalString;
      }
    }

}
