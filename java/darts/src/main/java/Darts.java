class Darts {

    private double x;
    private double y;
    
    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    

    int score() {
        double distance;
        distance = Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));

        if(distance <= 1){
            return 10;
        } else if(distance <= 5){
            return 5;
        } else if(distance <= 10){
            return 1;
        } 
        return 0;
    }

}
