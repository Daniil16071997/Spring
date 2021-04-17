package com.example.spring3.RobotBuildSpring.RobotBuild.Starts;


import com.example.spring3.RobotBuildSpring.RobotBuild.Pool.BumblebeePool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("allContext.xml");
        BumblebeePool bumblebeePool =(BumblebeePool) context.getBean("bumblebeePool");
//        System.out.println(bumblebee.getHand());
//        RobotConveyor bumblebeeConveyor = (RobotConveyor) context.getBean("bumblebeeConveyor");
//        Robot terminator1 = bumblebeeConveyor.createRobot();
//        Robot terminator2 = bumblebeeConveyor.createRobot();
//        Robot terminator3 = bumblebeeConveyor.createRobot();
//        System.out.println("Terminator 1 =" + terminator1);
//        System.out.println("Terminator 2 =" + terminator2);
//        System.out.println("Terminator 3 =" + terminator3);

//        bumblebee = (Bumblebee) context.getBean("bumblebee");
//        System.out.println(bumblebee.getHand());
//        bumblebee = (Bumblebee) context.getBean("bumblebee");
//        System.out.println(bumblebee.getHead());
//        bumblebee = (Bumblebee) context.getBean("bumblebee");
//        System.out.println(bumblebee.getHead());
           bumblebeePool.beginShow();
//
    }
}
