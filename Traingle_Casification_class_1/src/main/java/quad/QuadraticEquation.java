package quad;

public class QuadraticEquation {
	public static String classifyRoots(int a, int b, int c) {
        // check if input is valid
        if (!isValidInput(a) || !isValidInput(b) || !isValidInput(c)) {
            return "not valid, the number should be between 5-200";
        }
        
        // check if quadratic equation
        if (a == 0) {
            return "לא משוואה ריבועית";
        }
        
        //calc the discriminantt
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        
        // check the type
        if (discriminant > 0) {
            return "real roots";
        } else if (discriminant < 0) {
            return "imaginary roots";
        } else {
            return "double/repeated root";
        }
    }

    //using modular method to check if the input is valid
    private static boolean isValidInput(int value) {
        return value >= 5 && value <= 200;
    }
}