class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        String numberCheck = Integer.toString(numberToCheck);
        final int pow = numberCheck.length();
        int resultToCheck = 0;
        

        for(int i = 0; i < numberCheck.length(); i++){
            resultToCheck += (int)Math.pow(Character.getNumericValue(numberCheck.charAt(i)),pow);
    }
       ;
        
    return resultToCheck == numberToCheck;
}
}
