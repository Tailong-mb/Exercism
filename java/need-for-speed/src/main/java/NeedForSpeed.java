class NeedForSpeed {
    private int battery= 100;
    private int batteryDrain;
    private int speed;
    private int distance = 0;

    public NeedForSpeed(int Speed, int battery){
        if(battery>=0)
        this.batteryDrain = battery;
        if(Speed>=0)
        this.speed = Speed;
    }

    public boolean batteryDrained() {
        if(battery==0)
            return true;
        else
            return false;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if(this.battery >0){
                this.distance += this.speed;
                this.battery -= this.batteryDrain;
        }
        if(this.battery <0)
            this.battery = 0;
        
    }

    public static NeedForSpeed nitro() {
            return new NeedForSpeed(50,4);
        }
    }

class RaceTrack {
    private int distance;

    public RaceTrack(int Distance){
        if(Distance>0)
        this.distance += Distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
          while(!car.batteryDrained()){
            car.drive();
    }
        return car.distanceDriven() >= this.distance;
}
}
