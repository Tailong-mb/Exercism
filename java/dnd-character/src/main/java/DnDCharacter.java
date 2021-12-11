import java.util.Random;

class DnDCharacter {
    private int hitPoints = 10;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;


    /** Constructor */
    public DnDCharacter(){
        this.strength = this.ability();
        this.dexterity = this.ability();
        this.constitution = this.ability();
        this.intelligence = this.ability();
        this.wisdom = this.ability();
        this.charisma = this.ability();
        this.hitPoints += this.modifier(this.constitution);
        
    }
    
    /**  Method to set abilities */
    int ability() {
        int buffer;
        int minimum = 7;
        int sum = 0;
        for(int i = 1; i <= 4 ; i++){
            Random random = new Random();
            buffer = random.nextInt(6) + 1;
            if(buffer < minimum)
                minimum = buffer;
            sum += buffer;
        }
        
        return sum-minimum;
    }
    
    /** Get methods */
    
    int modifier(int input) {
        return (int) Math.floor((input - 10.0) / 2.0);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
       return hitPoints;
    }

}
