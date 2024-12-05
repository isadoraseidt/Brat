package teste;

import robocode.*;

import java.awt.Colors;


public class Teste1Isa extends Robot {
	boolean movingForward;

	
	public void run() {
		
		setBodyColor(Color.pink);
		setGunColor(Color.black);
		setRadarColor(Color.green);
		setBulletColor(Color.blue);
		setScanColor(Color.pink);
		
		while (true) {
			
			setAhead(40000);
			movingForward = true;
			setTurnRight(90);
			waitFor(new TurnCompleteCondition(this));
			setTurnLeft(180);
			waitFor(new TurnCompleteCondition(this));
			setTurnRight(180);
			waitFor(new TurnCompleteCondition(this))
	}
}

public void onHitWall(HitWallEvent e) {

		reverseDirection();
	}


	public void reverseDirection() {
		if (movingForward) {
			setBack(40000);
			movingForward = false;
		} else {
			setAhead(40000);
			movingForward = true;
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}

	public void onHitRobot(HitRobotEvent e) {
		
		if (e.isMyFault()) {
			reverseDirection();
		}
	}
}
