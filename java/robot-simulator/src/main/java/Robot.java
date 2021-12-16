public class Robot{

    private Orientation robotOrientation;
    private GridPosition robotGridPos;

    public Robot(GridPosition initPos, Orientation initOrientation){
        this.robotGridPos = initPos;
        this.robotOrientation = initOrientation;
    }

    public void turnRight() {
                this.robotOrientation = Orientation.values()[((this.robotOrientation.ordinal()+1)%4)];
    }

    public void turnLeft(){
                this.robotOrientation = Orientation.values()[((this.robotOrientation.ordinal()+3)%4)];
    }

    public void advance(){
        switch (this.robotOrientation) {
                        case EAST:
                            this.robotGridPos = new GridPosition(this.robotGridPos.x + 1, this.robotGridPos.y);
                            break;
                        case WEST:
                            this.robotGridPos = new GridPosition(this.robotGridPos.x - 1, this.robotGridPos.y);
                            break;
                        case NORTH:
                            this.robotGridPos = new GridPosition(this.robotGridPos.x, this.robotGridPos.y+ 1);
                            break;
                        case SOUTH:
                            this.robotGridPos = new GridPosition(this.robotGridPos.x, this.robotGridPos.y -1);
                            break;
                    }
    }

    public void simulate(String instruction){
        for(int i = 0; i < instruction.length();i++){
            char robotInstruction = instruction.charAt(i);
            switch (robotInstruction){
                case 'A':
                advance();
                break;
                case 'R':
                turnRight();
                break;
                case 'L':
                turnLeft();
                break;
                default:
                throw new IllegalArgumentException("Wrong instruction");
            }
        }

    }

    public Orientation getOrientation(){
        return this.robotOrientation;
    }

    public GridPosition getGridPosition(){
        return this.robotGridPos;
    }
}