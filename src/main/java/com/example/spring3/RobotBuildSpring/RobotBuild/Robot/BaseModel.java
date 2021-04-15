package com.example.spring3.RobotBuildSpring.RobotBuild.Robot;

import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.Hand;
import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.Head;
import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.Leg;
import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.Robot;
import lombok.Getter;
import lombok.Setter;

public abstract class BaseModel implements Robot {
    @Getter
    @Setter


    private Hand hand;
    private Leg leg;
    private Head head;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor()");
    }

    public BaseModel(Hand hand, Leg leg, Head head) {
        this();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }
}