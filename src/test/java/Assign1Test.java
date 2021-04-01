/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Azania
 */
public class Assign1Test {
    
    public Assign1Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
   public void TestAddMeth(){
       int num1 = 4;
       int num2 = 6;
        
       Assign1 test = new Assign1();
       
       int result = test.addMeth(num1, num2);
       assertEquals(10, result);
   }

@Test  // Testing object identity
@Disabled()
public void testCompare(){
    int a = 2;
    int b = 5;
    int c = a;
        
        assertSame(a,c); 
     }

@Test
public void testSquare(){
int a = 3;
        Assign1 test = new Assign1();
        int results = test.suare(a);
        assertEquals(9,results);
 }
}