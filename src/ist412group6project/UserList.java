/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

import java.util.ArrayList;

/**
 *
 * @author Liam
 */
public class UserList {
    
    
    private ArrayList<UserAccount> listOfUsers = null;
    
    public UserList(){  
       // Create the users and add them to the arraylist
       listOfUsers = new ArrayList();
       for(int i = 0; i < 5; i++){
           String testUsername = "example"+i+"@email.com";
           char[] testPassword = {'p', 'a', 's', 's'};
           Member newMember  = new Member (testUsername, testPassword);
           listOfUsers.add(newMember);
       }

    }
    
      public ArrayList<UserAccount> getListOfUsers(){
        return listOfUsers;
    }
    
    public boolean authenticate(String username2check, char[] password2check){
        boolean authenticated = false;
        for(int i = 0; i < listOfUsers.size(); i++){
            if(listOfUsers.get(i).authenticate(username2check, password2check)){
                authenticated = true;
                break;
            }
        }
        return authenticated;
        
    }
    
}
