package pglp_3;

class RobotStatic {
    private Position position;
    private Direction direction;
    RobotStatic() {
    }

    public void tourne(Direction direction){
        this.setDirection(direction);
    }
    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }


}
