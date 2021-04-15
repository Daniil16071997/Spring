package com.example.spring3.RobotBuildSpring.RobotBuild.Robot;

import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.Robot;
import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.RobotConveyor;

public abstract class BumblebeeConveyor implements RobotConveyor {
    @Override
    public abstract Robot createRobot();
}
