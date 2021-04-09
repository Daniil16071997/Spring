package com.example.spring3.RobotBuildSpring.RobotBuild.Starts;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Robot robot =(Robot) context.getBean("Robot");
        robot.action();
    }
}
