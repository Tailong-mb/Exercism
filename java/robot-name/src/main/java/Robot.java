import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Robot{

    //Attributes 
    private final static String letterUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static List<String> listOfRobotName = new ArrayList<String>();
    private String robotName ="";

    //Constructor 

    public Robot(){
        giveName();
    }

    //Methods

    /**
     * Every once in a while we need to reset a robot to its factory settings, which means that its name gets wiped. 
     * The next time you ask, that robot will respond with a new random name.
     */

    public void reset(){
        listOfRobotName.remove(this.robotName);
        this.robotName="";
        giveName();
    }

    public void giveName(){
        boolean nameOk = false;
        Random rand = new Random();
        while(!nameOk){
            this.robotName += this.letterUpperCase.charAt(rand.nextInt(26));
            this.robotName += this.letterUpperCase.charAt(rand.nextInt(26));
            for(int i = 0; i < 3; i++){
                this.robotName += Character.forDigit(rand.nextInt(9) , 10);
            }
            if(listOfRobotName.indexOf(this.robotName) == -1){
                this.listOfRobotName.add(this.robotName);
                nameOk = true;
            }
            else{
                this.robotName = "";
            }
        }
    }

    public String getName(){
        return this.robotName;
    }

}