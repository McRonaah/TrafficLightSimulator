public class TrafficLightSimulator {
    public static void main(String[] args) {
        for (int minute = 0; minute < 1440; minute++) {
            int hour = minute / 60;
            int minuteOfHour = minute % 60;
            
            System.out.printf("Time: %02d:%02d\n", hour, minuteOfHour);
            
            String trafficCondition = determineTrafficCondition(hour);
            
            int greenDuration = setGreenLightDuration(trafficCondition);
            int yellowDuration = 3;
            int redDuration = setRedLightDuration(trafficCondition);
            
            simulateTrafficLight(greenDuration, yellowDuration, redDuration);
            
            System.out.println("--------------------");
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static String determineTrafficCondition(int hour) {
        if (hour >= 7 && hour < 10) {
            return "Morning Rush Hour";
        } else if (hour >= 16 && hour < 19) {
            return "Evening Rush Hour";
        } else if (hour >= 23 || hour < 5) {
            return "Night";
        } else {
            return "Normal";
        }
    }
    
    public static int setGreenLightDuration(String trafficCondition) {
        switch (trafficCondition) {
            case "Morning Rush Hour":
            case "Evening Rush Hour":
                return 60;
            case "Night":
                return 30;
            default:
                return 45;
        }
    }
    
    public static int setRedLightDuration(String trafficCondition) {
        if (trafficCondition.equals("Night")) {
            return 60;
        } else {
            return 45;
        }
    }
    
    public static void simulateTrafficLight(int greenDuration, int yellowDuration, int redDuration) {
        System.out.println("Green light for " + greenDuration + " seconds");
        System.out.println("Yellow light for " + yellowDuration + " seconds");
        System.out.println("Red light for " + redDuration + " seconds");
    }

    public static boolean emergencyVehiclePresent = false;

    public static void handleEmergencyVehicle() {
    if (emergencyVehiclePresent) {
        System.out.println("Emergency vehicle detected! Switching to green light for emergency route.");
        // Set green light duration longer or maintain green until the emergency vehicle has passed
        simulateTrafficLight(120, 3, 15); // 2 minutes of green
    } else {
        simulateTrafficLight(setGreenLightDuration(determineTrafficCondition(0)), 3, setRedLightDuration(determineTrafficCondition(0)));
        }
    }
}
