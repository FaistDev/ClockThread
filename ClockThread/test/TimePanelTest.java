/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Ben
 */



@RunWith(value = Parameterized.class)
public class TimePanelTest {
    
     @Parameterized.Parameter(value = 0)
    public int time;
    @Parameterized.Parameter(value = 1)
    public boolean pos;
    @Parameterized.Parameter(value = 2)
    public int expResult;
    
    
    public TimePanelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class TimePanel.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        TimePanel instance = new TimePanel("Europe/Vienna");
        int result = instance.getZiffer(pos, time);
        assertEquals(expResult, result, 0.0);
    }
    
    @Parameterized.Parameters(name = "")
    public static Iterable<Object[]> data1(){
        return Arrays.asList(new Object[][]{
            {21,true,2},
            {21,false,1},
            {21,false,2}
    });
    }
    
    
    
    
}
