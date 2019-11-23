/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravitycalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class GravityCalculatorTest {
   
    /**
     * Test of main method, of class GravityCalculator.
     */
    @Test
    public void testUsingEarthGravity() {
        System.out.println("testUsingEarthGravity");
        double acceleration=-9.81;
        double initialVelocity=0.0;
        double fallingTime1=10.0;
        double initialPosition=0.0;
        double finalPosition;
       
        double exp = -490.5;
        
        finalPosition=0.5 * (acceleration* (fallingTime1 *fallingTime1)) + initialVelocity*(fallingTime1)+initialPosition;
        double result = finalPosition;
        assertEquals((int)result,(int)exp);
    }
    @Test
     public void testUsingMarsGravity() {
        System.out.println("testUsingMarsGravity");
       double gravity =-9.81;
        double initialVelocity=0.0;
        double fallingTime2=2018.0;
        double initialPosition=0.0;
        double finalPosition;
        double mass=6.39;
        double radius=3369600;
        double G=6.67;
        
        gravity =( (mass) * Math.pow(10,23) ) *( (G)* Math.pow(10,-11))/(radius*radius);
        finalPosition=0.5 * (gravity* (fallingTime2 *fallingTime2)) + initialVelocity*(fallingTime2)+initialPosition;
        double exp = 7643324.90;
        double result = finalPosition;
        assertEquals((int)result,(int)exp);
    }
   
}
