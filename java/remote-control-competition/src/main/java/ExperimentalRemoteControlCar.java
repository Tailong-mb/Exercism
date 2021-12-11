public class ExperimentalRemoteControlCar implements RemoteControlCar {
    
    private int distance;

    public void drive() {
        this.distance += 20;
    }

    public int getDistanceTravelled() {
         return this.distance;
    }
}
