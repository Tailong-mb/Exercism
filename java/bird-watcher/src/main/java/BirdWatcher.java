
class BirdWatcher {
    private final int[] birdsPerDay;

        /** Constructor */
    
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

        /** Method */
    
    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        if(this.birdsPerDay.length != 0){
        return   this.birdsPerDay[this.birdsPerDay.length - 1];
            }
        else return 0;
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i <this.birdsPerDay.length;i++){
            if(this.birdsPerDay[i] ==0){
                return true;
            }
        }
         return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int Sum = 0;
        if(numberOfDays > 7){
            numberOfDays = 7;
        }
        for(int i = 0; i < numberOfDays;i++){
            Sum += this.birdsPerDay[i];
        }
        return Sum;
    }

    public int getBusyDays() {
        int countBusyDays = 0;
        for(int i=0; i<this.birdsPerDay.length;i++){
            if(this.birdsPerDay[i] >= 5){
                     countBusyDays += 1;
            }
        }
        return countBusyDays;
    }
}
