package Starts;
import Interfice.RobotHand;
import Interfice.RobotHead;
import Interfice.RobotLeg;
public class Robot {
  private  RobotHand robotHand;
  private  RobotHead robotHead;
  private  RobotLeg robotLeg;
  public Robot( RobotHand robotHand, RobotHead robotHead, RobotLeg robotLeg){
      super();
      this.robotHand=robotHand;
      this.robotLeg=robotLeg;
      this.robotHead=robotHead;
  }
public  void action(){
      robotHead.thinks();
      robotLeg.run();
      robotHand.catchSomething();
}

}
