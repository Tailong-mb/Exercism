import java.math.BigInteger;

class Grains {

    private static final BigInteger vOne = BigInteger.valueOf(1);
    private static final BigInteger vTwo = BigInteger.valueOf(2);


    BigInteger grainsOnSquare(final int square) {

        if (square < 1 || square > 64)
        throw new IllegalArgumentException("square must be between 1 and 64");
            
        return vTwo.pow(square - 1);
    }


    BigInteger grainsOnBoard() {

        return vTwo.pow(64).subtract(vOne);

    }


}


