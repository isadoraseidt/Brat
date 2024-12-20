import robocode.*;
import java.awt.Color;


public class Brat extends Robot {

   
    public void run() {
    
setBodyColor(Color.magenta);
setGunColor(Color.black);
setRadarColor(Color.black);
setBulletColor(Color.white);
setScanColor(Color.magenta);

        while (true) {
            ahead(170);
            turnRight(90);
        }
    }

public void onScannedRobot(ScannedRobotEvent e) {
        String robotank = e.getName();
        double distancia = e.getDistance();
        System.out.println(robotank + " distância: " + distancia);
        
        if (distancia < 135) {
            fire(3); 
        } else {
            fire(2);
        }
    }
public void onHitWall(HitWallEvent e) {
        back(50);
        turnRight(90);
    }

    public void onHitByBullet(HitByBulletEvent e) {
	ahead(10);
	}
}
