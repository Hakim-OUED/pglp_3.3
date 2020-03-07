package pglp;

/**
 *
 */

 class RobotMobile {
     //position courante du Robot
    private Position position;
    //Direction actuelle du Robot
    private Direction direction;

    /**
     *
     */
    RobotMobile() { }

     /**
      *
      * @param direction
      */
    public void tourne(final Direction direction) {
        this.setDirection(direction);
    }

     /**
      *
      */
    public void avance() {
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
     public void setDirection(final Direction direction) {
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
