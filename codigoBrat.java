package sample;


import robocode.JuniorRobot;
public class Brat extends Robot {
	public void run() {
		
		setColors(pink, blue, yellow);

		while (true) {
			ahead(100); 
			turnGunRight(360); 
			back(100); 
			turnGunRight(360); 
		}
	}
