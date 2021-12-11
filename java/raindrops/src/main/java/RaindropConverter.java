class RaindropConverter {

    String convert(int number) {
       String rainConverted ="";

        /** Test all values */
        if(number %3 == 0)
        rainConverted += "Pling";
        if(number %5 == 0)
        rainConverted += "Plang";
        if(number %7 == 0)
        rainConverted += "Plong";
    

        return rainConverted == "" ? Integer.toString(number) : rainConverted;

    }

    
}
