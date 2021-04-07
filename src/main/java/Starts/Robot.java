package Starts;
import Interfice.RobotHand;
import Interfice.RobotHead;
import Interfice.RobotLeg;
public class Robot {
  private  Hand hand;
  private  Head head;
  private  Leg leg;
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
