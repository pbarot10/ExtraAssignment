/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foocorporation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class FooCorporationEmployeesTest {
    
    public FooCorporationEmployeesTest() {
    }
        
    /**
     * Test of totalPay method, of class FooCorporationEmployees.
     */
    @Test
    public void testTotalPay() {
        System.out.println("totalPay");
        int exp = 320;
        double BasePay = 8.0;
        int HoursWorked = 40;
        double result = 0;
        if(HoursWorked<=40 && BasePay>=8.00)
        {
           result=HoursWorked*BasePay;
        }
       else if(HoursWorked>40 && HoursWorked<=60 && BasePay>=8.00)
        {
            
            result=(40*BasePay)+((HoursWorked-40) * 1.5);
        }
       else if(BasePay<8.00)
       {
           System.out.println("Base pay will not be less than 8.00");
       }
       else if(HoursWorked>60)
       {
           System.out.println("Hours Worked  will not be greater than 60");
       }
        assertEquals(exp, (int) result);
    }
    
}
