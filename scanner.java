public void onScannedRobot(ScannedRobotEvent e) {
        String robotank = e.getName();
        double distancia = e.getDistance();
        System.out.println(robotank + " distância: " + distancia);
        
        if (distancia < 100) {
            fire(2); 
        } else {
            fire(2);
        }
    }
