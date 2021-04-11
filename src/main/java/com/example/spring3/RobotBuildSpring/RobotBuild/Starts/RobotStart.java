package com.example.spring3.RobotBuildSpring.RobotBuild.Starts;


import com.example.spring3.RobotBuildSpring.RobotBuild.Robot.Bumblebee;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class RobotStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("allContext.xml");
        Bumblebee bumblebee = (Bumblebee) context.getBean("bumblebee");
        System.out.println(bumblebee.getHand());
        bumblebee = (Bumblebee) context.getBean("bumblebee");
        System.out.println(bumblebee.getHand());
//        bumblebee = (Bumblebee) context.getBean("bumblebee");
//        System.out.println(bumblebee.getHead());
//        bumblebee = (Bumblebee) context.getBean("bumblebee");
//        System.out.println(bumblebee.getHead());
//       bumblebee.action();
}
}
