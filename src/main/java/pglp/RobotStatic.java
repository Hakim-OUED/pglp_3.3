package pglp;

/**
 *
 */
class RobotStatic {
    /*//Position Courante
    private Position position;*/

    //Direction Courante
    private Direction direction;

    /**
     *
     */
    RobotStatic() {
    }

    /**
     *
     * @param direction
     */
    public void tourne(Direction direction) {
        this.setDirection(direction);
    }

    /**
     *
     * @return direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     *
     * @param direction
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }


}
