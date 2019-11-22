package gravitycalculator;

public class GravityCalculator {

    public static void main(String[] args) {
        double gravity =-9.81,acceleration=-9.81;
        double initialVelocity=0.0;
        double fallingTime1=10.0,fallingTime2=2018.0;
        double initialPosition=0.0;
        double finalPosition;
        double mass=6.39;
        double radius=3369600;
        double G=6.67;
        
        
        finalPosition=0.5 * (acceleration* (fallingTime1 *fallingTime1)) + initialVelocity*(fallingTime1)+initialPosition;
        
        System.out.println("The object's position after " + fallingTime1 + " Seconds is " + finalPosition + " m. " );
        
       gravity =( (mass) * Math.pow(10,23) ) *( (G)* Math.pow(10,-11))/(radius*radius);
       finalPosition=0.5 * (gravity* (fallingTime2 *fallingTime2)) + initialVelocity*(fallingTime2)+initialPosition;
       System.out.println("The object's position after " + fallingTime2 + " Seconds its gravity is " + finalPosition + " m/s^2 " );

        
        
        
        
    }
    
}

