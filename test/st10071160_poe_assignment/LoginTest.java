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
        String username = "kyl_1";
        String username2 = "kyle!!!!!!!";
        
        boolean tname = lg.checkUserName(username);
        boolean tname2 = lg.checkUserName(username2);
        
        assertEquals(true, tname);
        assertEquals(false, tname2);
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity()
    {
        String password = "Ch&&sec@ke99!";
        String password2 = "password";
        
        boolean tpass = lg.checkPasswordComplexity(password);
        boolean tpass2 = lg.checkPasswordComplexity(password2);
        
        assertEquals(true, tpass);
        assertEquals(false, tpass2);
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser()
    {
        boolean user = true;
        boolean pass = true;
        boolean user2 = false;
        boolean pass2 = false;
        
        String rUser = lg.registerUser(user, pass);
        String rUser2 = lg.registerUser(user2, pass2);
        
        assertEquals("Username and password successfully captured", user);
        assertEquals("Username and password successfully captured", pass);
        assertEquals("Username not formatted correctly, please enter a username that includes an underscore (_) and is less than 5 characters long", user2);
        assertEquals("Password is not formatted correctly, please enter a password that is more than 8 characters long, and includes a capital letter, a number, and a special character", pass2);
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser()
    {
        String lUser = "kyl_1";
        String lPass = "Ch&&sec@ke99!";
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
        String name = "Kyle";
        String surname = "Kyle";
        
        String strUser = lg.returnLoginStatus();
        
        assertEquals("Welcome " + name + " " + surname + " it is great to see you again!", strUser);
    }
    
}
