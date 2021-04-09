package com.example.spring3.RobotBuildSpring.RobotBuild.ManyParts.Sony;

import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.Hand;

public class HandSony implements Hand {
    @Override
    public void catchSomething() {
        System.out.println("Sony robot get pringls))");
    }
}
