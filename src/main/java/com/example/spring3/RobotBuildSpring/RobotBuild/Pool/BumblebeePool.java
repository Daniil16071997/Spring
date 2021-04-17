package com.example.spring3.RobotBuildSpring.RobotBuild.Pool;

import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.Robot;
import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.RobotPool;

import java.util.Collection;

public class BumblebeePool implements RobotPool {
    private Collection<Robot> robotCollection;

    public void setRobotCollection(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }



    @Override
    public Collection<Robot> getCollectionRobot() {
        return robotCollection;
    }

    public void beginShow() {
        for (Robot robot : robotCollection) {
            robot.action();
        }
    }
}




