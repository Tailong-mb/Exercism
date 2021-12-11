public class ElonsToyCar {
    private int distance;
    private int battery;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distance + " meters";
    }

    public String batteryDisplay() {
        this.battery = 100-(this.distance/20);
        if(this.distance != 2000)
        return "Battery at " + this.battery +"%";
        else
        return "Battery empty";
    }

    public void drive() {
        if(this.distance < 2000)
        this.distance += 20;
    }
}
