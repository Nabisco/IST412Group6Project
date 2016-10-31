/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

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

  
    public UserList getUserList(){
        
        if(theUserList == null){
    
        theUserList = new UserList(theSerialization);
//        theSerialization.serializeObject(theUserList);
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