class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> { 
       
    private int distance;
    private int numberVictories;

   
    public void drive() {
        this.distance += 10;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        return this.numberVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        if(numberofVictories>=0)
            this.numberVictories = numberofVictories;
    }
                                                                                                      
     public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(this.getNumberOfVictories(), other.getNumberOfVictories());
    }
}
