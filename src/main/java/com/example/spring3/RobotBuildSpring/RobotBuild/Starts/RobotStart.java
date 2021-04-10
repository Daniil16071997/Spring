package com.example.spring3.RobotBuildSpring.RobotBuild.Starts;


import com.example.spring3.RobotBuildSpring.RobotBuild.Robot.Bumblebee;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class RobotStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Bumblebee bumblebee = (Bumblebee) context.getBean("bumblebee");
        bumblebee.action();
    }
}
