package com.example.spring3.RobotBuild.Starts;
import com.example.spring3.RobotBuild.Interface.Hand;
import com.example.spring3.RobotBuild.Interface.Head;
import com.example.spring3.RobotBuild.Interface.Leg;
public class Robot {
  private final Hand hand;
  private final Head head;
  private final Leg leg;
  public Robot(Hand hand,Head head, Leg leg){
      super();
      this.hand=hand;
      this.leg=leg;
      this.head=head;
  }
public  void action(){
      head.thinks();
      leg.run();
      hand.catchSomething();
}

}
