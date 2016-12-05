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
public class NavCntl {
    
    NavUI theNavUI =null;
    UserAccount currentUser;
    Serialize theSerialization;
    
    public NavCntl(UserAccount loggedInUser, Serialize serialization) {
        theSerialization = serialization;
        currentUser = loggedInUser;
        createNavUI();
    
    }
    
    public void createNavUI() {
        theNavUI = new NavUI(this, currentUser);
        theNavUI.setLocationRelativeTo(null);
        showNavControl();
        
    }
    
    public void showNavControl() {
        theNavUI.setVisible(true);
    }

    public void NavToUserProfile() {
        UserProfileCntl theUserProfileCntl = new UserProfileCntl(this, currentUser);
        theNavUI.setVisible(false);
    }
    
    public void navToBudgetStatistics(){
        BudgetStatisticsCntrl theBudgetStatistics = new BudgetStatisticsCntrl(this, currentUser);
        theBudgetStatistics.navToBudgetStatistics();
        theNavUI.setVisible(false);
    }
    
    public void navToExpenseUI(){
        ExpenseCntl theExpenseCntl = new ExpenseCntl(this, currentUser);
        theExpenseCntl.navToExpenseUI();
        theNavUI.setVisible(false);
    }
    public void navToSetBudget(){
        SetBudgetCntl theBudgetCntl = new SetBudgetCntl(this, currentUser);
        theBudgetCntl.navToBudgetUI();
        theNavUI.setVisible(false);
    }
    
    public void updateAccountTotValue() {
        try {
            theSerialization.openOutputStream();
            theSerialization.outputStream.writeObject(currentUser);
            theSerialization.closeOutputStream();
            
        } catch (IOException ex) {
            Logger.getLogger(NavCntl.class.getName()).log(Level.SEVERE, null, ex);
        }
        theNavUI.updateAccountTotValue();
    }
    //trying to push
}
