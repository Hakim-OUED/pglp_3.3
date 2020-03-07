package pglp_3;



 class Robot {
    private Position position;
    private Direction direction;

    Robot(){}

    public void tourne(){}
    public void avance(){}

}

class RobotStatic extends Robot {

     RobotStatic(){}

    @Override
    public void avance(){
        throw new UnsupportedOperationException();
    }

}
