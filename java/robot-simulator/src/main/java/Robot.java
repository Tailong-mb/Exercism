public class Robot{

    private Orientation robotOrientation;
    private GridPosition robotGridPos;

    public Robot(GridPosition initPos, Orientation initOrientation){
        this.robotGridPos = initPos;
        this.robotOrientation = initOrientation;
    }

    public void turnRight() {
                switch(this.robotOrientation) {
                    case NORTH:
                        robotOrientation = Orientation.EAST;
                        break;
                    case EAST:
                        robotOrientation = Orientation.SOUTH;
                        break;
                    case SOUTH:
                        robotOrientation= Orientation.WEST;
                        break;
                    case WEST:
                        robotOrientation= Orientation.NORTH;
                        break;
                }
            }
    
    public void turnLeft(){
                switch(this.robotOrientation) {
                    case NORTH:
                        robotOrientation = Orientation.WEST;
                        break;
                    case EAST:
                        robotOrientation = Orientation.NORTH;
                        break;
                    case SOUTH:
                        robotOrientation = Orientation.EAST;
                        break;
                    case WEST:
                        robotOrientation = Orientation.SOUTH;
                }
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