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
public class LoginCntl {
    
    private LoginUI theLoginUI = null;
    private UserList theUserList = null;
    
    public  LoginCntl(){

        theLoginUI = new LoginUI(this);
        theLoginUI.setLocationRelativeTo(null);
        theLoginUI.setVisible(true);
        theLoginUI.setSize(300, 450);
}
    
    public UserList getUserList(){
    if(theUserList == null){
    
    theUserList=new UserList();
 
    }
    
    return theUserList;
    }
 protected boolean requestAuthenticate(String theUsername, char[] thePassword){
        boolean authenticated = false;
        
        
         if(getUserList().authenticate(theUsername, thePassword)){
            System.out.println("Authenticated!" );
            theLoginUI.setVisible(false);
            NavCntl theNavCntl = new NavCntl(theUsername);
            authenticated = true;
        }
        return authenticated;
 }
    
}