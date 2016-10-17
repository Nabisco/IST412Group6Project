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
public class NavCntl {
    
    NavUI theNavUI =null;
    UserAccount currentUser;
    
    public NavCntl(UserAccount loggedInUser){
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
        BudgetStatisticsCntrl theBudgetStatistics = new BudgetStatisticsCntrl(this);
        theBudgetStatistics.navToBudgetStatistics();
        theNavUI.setVisible(false);
    }
    
    public void updateAccountTotValue() {
        theNavUI.updateAccountTotValue();
    }

}
