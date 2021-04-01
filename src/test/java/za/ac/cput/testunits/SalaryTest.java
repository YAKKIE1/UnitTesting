/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testunits;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author AmyrH - 214044750
 */
public class SalaryTest {
    
    public SalaryTest() {
    }
public class ObjectEqualityJUnitTest {
    private Salary Leave1;
    private Salary Leave2;
    private Salary Leave3;
    
    public ObjectEqualityJUnitTest() {   
    }
    
    
    
    @BeforeEach
    public void setUp() {
       Leave1= new Salary();
       Leave2= new Salary();
       Leave3= new Salary();
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testIdentity(){
     assertSame(Leave1,Leave3);
     }
     
     
     
     @Test
     @Timeout(10)
     public void testTimeout()throws InterruptedException
     {
     while(true)
     {
     Thread.sleep(30);
     }
     }
}
}

