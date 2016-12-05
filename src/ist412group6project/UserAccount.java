/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

import java.io.Serializable;

/**
 *
 * @author gme50
 */
public abstract class UserAccount implements Serializable{
    
    
    private String username = "";
    private char[] password = null;
    private ExpenseCalender expenceCallender = null;
    private double userAccountTotal;
    
    
     public UserAccount(){
        
    }
    

    
    public UserAccount(String newUsername, char[] newPassword){
        username = newUsername;
        password = newPassword;
        expenceCallender = new ExpenseCalender("Checking");
        userAccountTotal = 0.00;
    }
    
  
    public String getUsername(){
        return username;
    }
    
    public char[] getPassword(){
        return password;
    }
    
    
    public abstract boolean authenticate(String unToCheck, char[] pwTocheck);

    /**
     * @return the expenceCallender
     */
//    public ExpenseCalender getExpenceCallender() {
//        return expenceCallender;
//    }
//
//    /**
//     * @param expenceCallender the expenceCallender to set
//     */
//    public void setExpenceCallender(ExpenseCalender expenceCallender) {
//        this.expenceCallender = expenceCallender;
//    }

    /**
     * @return the userAccountTotal
     */
    public double getUserAccountTotal() {
        return userAccountTotal;
    }

    /**
     * @param userAccountTotal the userAccountTotal to set
     */
    public void setUserAccountTotal(double userAccountTotal) {
        this.userAccountTotal = userAccountTotal;
    }

    /**
     * @return the expenceCallender
     */
    public ExpenseCalender getExpenceCallender() {
        return expenceCallender;
    }

    /**
     * @param expenceCallender the expenceCallender to set
     */
    public void setExpenceCallender(ExpenseCalender expenceCallender) {
        this.expenceCallender = expenceCallender;
    }

    


}
    

