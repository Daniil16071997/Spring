package com.example.spring3.RobotBuild.ManyParts.Sony;
import com.example.spring3.RobotBuild.Interface.Hand;

public class HandSony implements Hand {
    @Override
    public void catchSomething() {
        System.out.println("Sony robot get pringls))");
    }
}
