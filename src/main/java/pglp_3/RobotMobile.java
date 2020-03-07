package pglp_3;



 class Robot {
    private Position position;
    private Direction direction;

    Robot(){}

    public void tourne(Direction direction){
        this.setDirection(direction);
    }
    public void avance(){}

     public Direction getDirection() {
         return direction;
     }

     public void setDirection(Direction direction) {
         this.direction = direction;
     }

}





/*
class RobotStatic extends Robot {

     RobotStatic(){}

    @Override
    public void avance(){
        throw new UnsupportedOperationException();
    }
}
*/