package com.example.spring3.RobotBuild.Starts;

import com.example.spring3.RobotBuild.ManyParts.Lg.HandLg;
import com.example.spring3.RobotBuild.ManyParts.Sony.HeadSony;
import com.example.spring3.RobotBuild.ManyParts.Sony.LegSony;

public class RobotStart {
    public static void main(String[] args) {
        HandLg handLg = new HandLg();
        HeadSony headSony = new HeadSony();
        LegSony legSony = new LegSony();
        Robot robot= new Robot(handLg, headSony, legSony);
        robot.action();
    }
}
