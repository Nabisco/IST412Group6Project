/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Liam
 */
public class UserList implements Serializable {
    
    
    private ArrayList<UserAccount> listOfUsers = new ArrayList<>();
    Serialize theSerialization;
    Member theUser;
    
    public UserList(Serialize serialization){  
       theSerialization = serialization;

        if (listOfUsers.isEmpty()) {
          createTestAccounts(); 
//        theSerialization.serializeObject(listOfUsers);
       }
    }

    private void createTestAccounts() {
        char[] testSerializedPassword = {'p', 'a', 's', 's'};
        Member serializedAccount = new Member("example1@email.com", testSerializedPassword);
        try {
            theUser = theSerialization.deserializeObject("theUser");
            if(theUser != null) {
                listOfUsers.add(theUser);
            }
            if(!listOfUsers.isEmpty()) { 
                System.out.println("List of users populated");
            }
            else {
                System.out.println("List of users NOT populated");
            }
        } catch (Exception e) {
            System.out.println("Failed");
        }

        // Create the users and add them to the arraylist
        if(listOfUsers.isEmpty()) {
           String testUsername = "example1@email.com";
           char[] testPassword = {'p', 'a', 's', 's'};
           theUser = new Member (testUsername, testPassword);
           theSerialization.serializeObject(theUser);
           listOfUsers.add(theUser);
//           String testUsername2 = "example2@email.com";
//           char[] testPassword2 = {'p', 'a', 's', 's'};
//           Member newMember2  = new Member (testUsername, testPassword);
////         theSerialization.serializeObject(newMember);
//           listOfUsers.add(newMember2);

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
