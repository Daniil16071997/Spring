package com.example.spring3.RobotBuildSpring.RobotBuild.Robot;

import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.Hand;
import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.Head;
import com.example.spring3.RobotBuildSpring.RobotBuild.Interface.Leg;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Bumblebee {
    private Hand hand;
    private Head head;
    private Leg leg;
    private String color;
    private int year;
    private boolean soundEnabled;

    public Bumblebee() {
    }

    public Bumblebee(Hand hand, Head head, Leg leg) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public Bumblebee(Hand hand, Head head, Leg leg, String color, int year, boolean soundEnabled) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public Bumblebee(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public void action() {
        head.thinks();
        leg.run();
        hand.catchSomething();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnabled);
    }
    public void init(){
        System.out.println("init");
    }
    public void destroy(){
        System.out.println("destroy");
    }


}
