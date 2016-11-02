/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Liam
 */
public class UserList {
    
    
    private ArrayList<UserAccount> listOfUsers = new ArrayList<>();
    Serialize theSerialization;
    Member theUser;
    
    public UserList(Serialize serialization){  
       theSerialization = serialization;

        if (listOfUsers.isEmpty()) {
          createTestAccounts(); 
       }
    }

    private void createTestAccounts() {
        
        // Create the users and add them to the arraylist
        try {
            theSerialization.openInputStream();
            Object o;
            while((o = theSerialization.inputStream.readObject()) != null) {
                UserAccount savedUser = (UserAccount)o;
                listOfUsers.add(savedUser);
                
            }
                theSerialization.closeInputStream();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(UserList.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        if(listOfUsers.isEmpty()) {
           
           String testUsername = "example1@email.com";
           char[] testPassword = {'p', 'a', 's', 's'};
           Member one = new Member (testUsername, testPassword);
           listOfUsers.add(one);
           
           String testUsername2 = "example2@email.com";
           char[] testPassword2 = {'p', 'a', 's', 's'};
           Member two = new Member (testUsername, testPassword);
           listOfUsers.add(two);
           
           theSerialization.openOutputStream();
           for(UserAccount ua : listOfUsers) {
               try {
                   theSerialization.outputStream.writeObject(ua);
               } catch (IOException ex) {
                   Logger.getLogger(UserList.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           theSerialization.closeOutputStream();
        } 
    }
       
       
    
    
      public ArrayList<UserAccount> getListOfUsers(){
        return listOfUsers;
    }
      
      public UserAccount getCurrentUser(String userName) {
          UserAccount userAccountToPass = null;
          for(UserAccount uA : listOfUsers) {
              if(uA.getUsername().equals(userName)) {
                  userAccountToPass = uA;
              }
          }
          return userAccountToPass;
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
