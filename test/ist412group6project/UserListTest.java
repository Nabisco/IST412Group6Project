/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gme50
 */
public class UserListTest {
    
    public UserListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

//    /**
//     * Test of getListOfUsers method, of class UserList.
//     */
//    @Test
//    public void testGetListOfUsers() {
//        System.out.println("getListOfUsers");
//        UserList instance = new UserList();
//        ArrayList<UserAccount> expResult = new ArrayList<>();
//        char[] testPassword = {'p', 'a', 's', 's'};
//        
//        Member newMember1 = new Member("example0@email.com", testPassword);
//        Member newMember2 = new Member("example1@email.com", testPassword);
//        Member newMember3 = new Member("example2@email.com", testPassword);
//        Member newMember4 = new Member("example3@email.com", testPassword);
//        Member newMember5 = new Member("example4@email.com", testPassword);
//        expResult.add(newMember1);
//        expResult.add(newMember2);
//        expResult.add(newMember3);
//        expResult.add(newMember4);
//        expResult.add(newMember5);
//        
//        ArrayList<UserAccount> result = instance.getListOfUsers();
//        assertEquals(expResult.get(0), result.get(0));
//    }

    /**
     * Test of authenticate method, of class UserList.
     */
    @Test
    public void testAuthenticate() {
        System.out.println("authenticate");
        String username2check = "example1@email.com";
        char[] password2check = {'p', 'a', 's', 's'};
        UserList instance = new UserList();
        boolean expResult = true;
        boolean result = instance.authenticate(username2check, password2check);
        assertEquals(expResult, result);
        
    }
    
}
