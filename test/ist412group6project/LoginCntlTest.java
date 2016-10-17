/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Liam
 */
public class LoginCntlTest {
    
    public LoginCntlTest() {
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

   
    
    @Test
    public void testRequestAuthenticate() {
        System.out.println("requestAuthenticate");
        String theUsername = "";
        char[] thePassword = null;
        LoginCntl instance = new LoginCntl();
        boolean expResult = false;
        boolean result = instance.requestAuthenticate(theUsername, thePassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
}
