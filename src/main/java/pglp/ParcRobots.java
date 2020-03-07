package pglp;

import java.util.ArrayList;

/**
 *
 */
public class ParcRobots {
    //Arraylist qui contiendra tous les rtotbots du parc
    private static ArrayList<RobotMobile> tousRobotMobile;

    ParcRobots() {
        tousRobotMobile = new ArrayList<RobotMobile>();
    }

    /**
     *
     */
    public static void avancerTous() {
        tousRobotMobile.stream().forEach(RobotMobile::avance);

    }
}
