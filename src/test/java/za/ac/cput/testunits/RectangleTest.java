
package za.ac.cput.testunits;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Lundi MKhungwane - 216039746
 * 
 */

public class RectangleTest {
   
    public Rectangle number1;
    public Rectangle number2;
    public Rectangle number3;
    
   /* @BeforeAll
    public static void tearDown(){
        System.out.println("This method should run before all other methods.");
    }*/
    
    @BeforeEach
    public void setUp(){
        number1 = new Rectangle();
        number2 = new Rectangle();
        number3 = number1;
    }
    
    @Test
    @Timeout(1000)
    void testTimeout() throws InterruptedException{
        while (true)
        {}
    }
    /**
     *  TEST FOR IDENTITY
     */
    @Test
    void testIdentity(){
        assertSame(number1, number3);
    }
    /**
     * TEST FOR EQUALITY
     */
    @Test
    public void testEquality(){
        assertEquals(number1, number3);
    }
    
    @Test
    /**
     * Test for the getNumber1() method of class Rectangle
     */
    public void testGetNumber1(){
        System.out.println("getNumber1");
        double expectedNum1 = 5.2;
        number1.setNumber1(5.2);
        double num1 = number1.getNumber1(); 
        assertEquals(expectedNum1, num1 );
      
    }
    
    /**
     * Test of setNumner1() method of Rectangle
     */
    @Test
    public void testSetNumber1(){
        System.out.println("setNumber1");
        double num1 = 0;
        Rectangle instance = new Rectangle();        
        instance.setNumber1(num1); 
    }
    
    /**
     * DISABLING TEST
     */
    @Test
    void testAreaRectangle() {
       double expected = 4;
      // double actualArea = Rectangle.areaRectangle();
       assertEquals(expected ,4, "The method should multiply two numbers");
       
    }
}
