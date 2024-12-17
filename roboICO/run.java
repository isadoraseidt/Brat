import robocode.*;
import java.awt.Color;


public class Main extends Robot {

   
    public void run() {
    
setBodyColor(Color.pink);
setGunColor(Color.black);
setRadarColor(Color.black);
setBulletColor(Color.white);
setScanColor(Color.pink);

        while (true) {
            ahead(120);
            turnRight(90);
        }
    }
}
