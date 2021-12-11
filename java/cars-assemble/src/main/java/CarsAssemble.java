public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        switch (speed){
            case 1: case 2: case 3: case 4:
                return speed*221;
            case 5: case 6: case 7: case 8:
                return speed*221*0.90;
            case 9:
                return speed*221*0.80;
            case 10:
                return speed*221*0.77;
            default:
                return 0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)this.productionRatePerHour(speed)/60;
    }
}
