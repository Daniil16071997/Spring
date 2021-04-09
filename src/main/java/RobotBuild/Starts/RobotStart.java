package RobotBuild.Starts;

import RobotBuild.ManyParts.Lg.HandLg;
import RobotBuild.ManyParts.Sony.HeadSony;
import RobotBuild.ManyParts.Sony.LegSony;

public class RobotStart {
    public static void main(String[] args) {
        HandLg handLg = new HandLg();
        HeadSony headSony = new HeadSony();
        LegSony legSony = new LegSony();
        Robot robot= new Robot(handLg, headSony, legSony);
        robot.action();
    }
}
