public class Lasagna {
    
   public int expectedMinutesInOven(){
       return 40;
   }
    
    public int remainingMinutesInOven(int time){
        return 40 - time;
    }

    public int preparationTimeInMinutes(int number){
        return 2*number;
    }

    public int totalTimeInMinutes(int number, int time){
        return 40-this.remainingMinutesInOven(time)+ this.preparationTimeInMinutes(number);
    }
}
