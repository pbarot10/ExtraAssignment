/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marathon;

import static marathon.Marathon.BestRunner;
import static marathon.Marathon.secondFastestIndex;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class MarathonTest {
    
            String [] names={
            "Elena","Thomas " ,"Hamilton","Suzie",
            "Phil" ,"Matt" ,"Alex" ,"Emma" ,"John" ,
            "James" ,"Jane" ,"Emily" ,"Daniel" ,
            "Neda" ,"Aaron" ,"Kate"};
        int [] times = {
            341,273,278,329,445,
            402,388,275,243,334,412,
            393,299,343,317,265
        };
    

    /**
     * Test of BestRunner method, of class Marathon.
     */
    @Test
    public void testBestRunner() {
        System.out.println("BestRunner");
          int exp = 243;
        int result = BestRunner(times);
        result = times[result];
        assertEquals(result, exp);
    }

    /**
     * Test of secondFastestIndex method, of class Marathon.
     */
    @Test
    public void testSecondFastestIndex() {
        System.out.println("secondFastestIndex");
            int exp = 265;
        int result = secondFastestIndex(times);
        result = times[result];
        assertEquals(result, exp);
    }
    
}
