/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st10071160_poe_assignment;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aidan
 */
public class TaskTest
{
    Task tk = new Task();
    
    public TaskTest()
    {
    }

    /**
     * Test of inputTask method, of class Task.
     */
    @Test
    public void testInputTask()
    {
    }

    /**
     * Test of getTName method, of class Task.
     */
    @Test
    public void testGetTName()
    {
    }

    /**
     * Test of getDDetails method, of class Task.
     */
    @Test
    public void testGetDDetails()
    {
    }

    /**
     * Test of getNum method, of class Task.
     */
    @Test
    public void testGetNum()
    {
    }

    /**
     * Test of getTDesc method, of class Task.
     */
    @Test
    public void testGetTDesc()
    {
    }

    /**
     * Test of getTStatus method, of class Task.
     */
    @Test
    public void testGetTStatus()
    {
    }

    /**
     * Test of getTDuration method, of class Task.
     */
    @Test
    public void testGetTDuration()
    {
    }

    /**
     * Test of getTID method, of class Task.
     */
    @Test
    public void testGetTID()
    {
    }

    /**
     * Test of increaseTNum method, of class Task.
     */
    @Test
    public void testIncreaseTNum()
    {
    }

    /**
     * Test of checkTDesc method, of class Task.
     */
    @Test
    public void testCheckTDesc()
    {
        String description = "Create Login to authenticate users";
        
        boolean bDesc = tk.checkTDesc(description);
        
        assertEquals(true, bDesc);
    }

    /**
     * Test of returnTID method, of class Task.
     */
    @Test
    public void testReturnTID()
    {
        String details = "Robyn Harrison ";
        String taskName = "Login Feature";
        
        String id = tk.returnTID();
        
        assertEquals("", id);
        
    }

    /**
     * Test of totalHours method, of class Task.
     */
    @Test
    public void testTotalHours()
    {
        int tHours = 8;
        
        int ttHours = tk.totalHours(tHours);
        
        assertEquals(8, ttHours);
        
    }

    /**
     * Test of toString method, of class Task.
     */
    @Test
    public void testToString()
    {
    }
    
}
