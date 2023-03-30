package step3_인터페이스;

interface RobotInterface {
	
}

class DanceRobot implements RobotInterface{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class DrawRobot implements RobotInterface {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
class SingRobot implements RobotInterface  {
	void sing() {
		System.out.println("노래를 부릅니다.");
	}
}
public class RobotEx {
	public static void main(String [] args) {
		RobotEx[] rb = new RobotEx[3];
		
//		rb[0] = new DanceRobot();
//		rb[1] = new DrawRobot();
//		rb[2] = new SingRobot();
		
		for (RobotEx r:rb) {
			
		}	
	}
}
