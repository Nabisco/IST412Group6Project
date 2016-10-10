/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gme50
 */
public class MemberTest {
    
    public MemberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of authenticate method, of class Member.
     */
    @Test
    public void testAuthenticate() {
        System.out.println("authenticate");
        String username = "example1@email.com";
        char[] pwToCheck = {'p', 'a', 's', 's'};
        Member instance = new Member(username, pwToCheck);
        boolean expResult = true;
        boolean result = instance.authenticate(username, pwToCheck);
        assertEquals(expResult, result);
    }
    
}
