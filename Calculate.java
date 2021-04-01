package za.ac.cput.testunits;

/**
 *
 * @author TSHEGOFATSO MOLEFE - 219001235
 */
public class MyCalculator {
    int addition(int a, int b){
        return a+b;
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testunits;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;



/**
 *
 * @author Tshegofatso Molefe - 219001235
 */
public class MyCalculatorTest {
    public int a;
    public int b;
    
    public MyCalculatorTest() {
       
    }
   @Before
    public void setUp() {        
    }
     @Test
    //testIdentity(); 
    
   public void assertNotSame(int a, int b ) {
   }
   
    @Test 
    void testEquality(){
    }
    
     @Test
    public void assertEquals(int expected, int actual) {
        
    }
        
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    fail("This test is a prototype");
    
    @Test
    @Timeout(120)
    public  void testWithTimeout(){
        System.out.println(int a + "" + Timeout());
        
    }
    
    @Test
    public static void testDisabling(){
    }

    private String Timeout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
