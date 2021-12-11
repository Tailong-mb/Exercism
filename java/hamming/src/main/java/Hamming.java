public class Hamming {
    private int hammingDistance = 0;

    public Hamming(String leftStrand, String rightStrand) {

        /* Exception **/
        
        String exceptionMessage = "leftStrand and rightStrand must be of equal length.";
        if(leftStrand.length() != rightStrand.length()){
            if(leftStrand.isEmpty())
                 exceptionMessage = "left strand must not be empty.";
            if(rightStrand.isEmpty())
                exceptionMessage = "right strand must not be empty.";   
            throw new IllegalArgumentException(exceptionMessage);
        }

        /* Standard case **/
        
        int i =0;
        while(i<leftStrand.length()){
            if(leftStrand.charAt(i) != rightStrand.charAt(i))
                this.hammingDistance += 1;
                i++;
        }
       
           
    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
