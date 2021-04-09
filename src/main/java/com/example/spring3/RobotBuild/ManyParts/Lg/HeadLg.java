package com.example.spring3.RobotBuild.ManyParts.Lg;

import com.example.spring3.RobotBuild.Interface.Head;

public class HeadLg implements Head {
    @Override
    public void thinks() {
        System.out.println("Lg robot thinks");
    }
}
