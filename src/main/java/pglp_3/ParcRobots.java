package pglp_3;

import java.util.ArrayList;

public class ParcRobots {
    public ArrayList<Robot> tousRobot=new ArrayList<Robot>();
    private Robot robot =new Robot();

    public void avancerTous (){
        tousRobot.stream().forEach(Robot::avance);

    }
}
