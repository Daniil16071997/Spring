package com.example.spring3.RobotBuildSpring.RobotBuild.Robot;

import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.Hand;
import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.Head;
import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.Leg;
import com.example.spring3.RobotBuildSpring.RobotBuild.ManyParts.Lg.HandLg;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class Bumblebee {
    private Hand hand;
    private  Head head;
    private  Leg leg;

    public Bumblebee(Hand hand, Head head, Leg leg) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public void action() {
        head.thinks();
        leg.run();
        hand.catchSomething();
    }



}
