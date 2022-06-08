/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st10071160_poe_assignment;

import org.junit.Test;
import static org.junit.Assert.*;
import ST10071160_POE_Assignment.*;

/**
 *
 * @author Aidan
 */
public class LoginTest
{
    Login lg = new Login();
    public LoginTest()
    {
    }

    /**
     * Test of getUsername method, of class Login.
     */
    @Test
    public void testGetUsername()
    {
    }

    /**
     * Test of setUsername method, of class Login.
     */
    @Test
    public void testSetUsername()
    {
    }

    /**
     * Test of getPassword method, of class Login.
     */
    @Test
    public void testGetPassword()
    {
    }

    /**
     * Test of setPassword method, of class Login.
     */
    @Test
    public void testSetPassword()
    {
    }

    /**
     * Test of getLoginUser method, of class Login.
     */
    @Test
    public void testGetLoginUser()
    {
    }

    /**
     * Test of getLoginPass method, of class Login.
     */
    @Test
    public void testGetLoginPass()
    {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName()
    {
        String username = "Aida_";
        
        boolean tname = lg.checkUserName(username);
        
        assertEquals(true, tname);
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity()
    {
        String password = "Bradley_999";
        
        boolean tpass = lg.checkPasswordComplexity(password);
        
        assertEquals(true, tpass);
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser()
    {
        boolean user = true;
        boolean pass = true;
        
        String rUser = lg.registerUser(user, pass);
        
        assertEquals("Username and password successfully captured", user);
        assertEquals("Username and password successfully captured", pass);
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser()
    {
        String lUser = "Aida_";
        String lPass = "Bradley_999";
        boolean tlUser = lg.loginUser(lUser);
        boolean tlPass = lg.loginUser(lPass);
        
        assertEquals(true, tlUser);
        assertEquals(true, tlPass);
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus()
    {
        boolean logUser = true;
        String name = "";
        String surname = "";
        
        String strUser = lg.returnLoginStatus();
        
        assertEquals("Welcome " + name + " " + surname + " it is great to see you again!", strUser);
    }
    
}
