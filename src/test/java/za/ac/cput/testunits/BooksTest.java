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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Ali Mohamed - 219113505
 */
public class BooksTest {
    private Books a;
    private Books b;
    private Books c;
    public BooksTest() {
    }
    
    @BeforeEach
    public void setUp() {
        a = new Books(1, 300, "Maze Runner");
        b = new Books(2, 300, "Attack on Titan");
        c = new Books(3, 450, "Bocu no pico");
    }

    @Test
    public void objectEquality(){
        assertEquals( 450, c.getPrice(), "Not Equal");
    }
    
    @Test
    public void objectIdentity(){
        Books d = a;
        assertSame(a, d, "Not same");
    }
    
    //this test fails
    
    @Test
    public void testFail(){
        assertSame(a.getPrice(), b.getPrice(), "Not same");
    }
    
    //this test fails if execution time exceeds 1 second
    @Timeout (1)
    @Test 
    public void timeout(){
        for(int i = 0; i < 60000; i++){
            System.out.println(i);
        }
    }
    
    //this test gets skipped
    @Disabled
    @Test
    public void skip(){
        assertEquals( 450, c.getPrice(), "Not Equal");
    }
    
    
}
