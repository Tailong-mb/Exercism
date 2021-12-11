class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return (int) Math.pow(input*(input+1)/2,2);
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for(int i = 1; i<=input ; i++){
            sum += Math.pow(i,2);
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
