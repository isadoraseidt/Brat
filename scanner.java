public void onScannedRobot(ScannedRobotEvent e) {
        String robotank = e.getName();
        double distancia = e.getDistance();
        System.out.println(robotank + " distância: " + distancia);
        
        if (distancia < 135) {
            fire(3); 
        } else {
            fire(1);
        }
    }
