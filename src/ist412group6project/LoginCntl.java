/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

import java.io.EOFException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Liam
 */

//=)
public class LoginCntl {
    
    private LoginUI theLoginUI = null;
    private UserList theUserList = null;
    private Serialize theSerialization = null;
    
    public  LoginCntl(Serialize serialization){
        theSerialization = serialization;
        theLoginUI = new LoginUI(this);
        theLoginUI.setLocationRelativeTo(null);
        theLoginUI.setVisible(true);
        theLoginUI.setSize(300, 450);
        
}

  
    public UserList getUserList() {
        
        if(theUserList == null) {
            
            try {
                theUserList = new UserList(theSerialization);
            } catch (EOFException ex) {
                Logger.getLogger(LoginCntl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    
    return theUserList;
    }
    
    protected boolean requestAuthenticate(String theUsername, char[] thePassword){
        boolean authenticated = false;
        
        
         if(getUserList().authenticate(theUsername, thePassword)){
            System.out.println("Authenticated!" );
            theLoginUI.setVisible(false);
            
            UserAccount currentUser = getUserList().getCurrentUser(theUsername);
            
            NavCntl theNavCntl = new NavCntl(currentUser, theSerialization);
            authenticated = true;
        }
        return authenticated;
 }
    
}