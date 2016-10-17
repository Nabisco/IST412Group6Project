/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

/**
 *
 * @author gme50
 */
public class UserProfileCntl {
    
    private NavCntl parentNavCntl;
    private UserProfileUI userProfileUI;
    

    public UserProfileCntl(NavCntl theNavCntl, UserAccount userName) {
        parentNavCntl = theNavCntl;
        navToUserUserProfileUI(userName);
    }
    
    

    public void navToUserUserProfileUI(UserAccount userName) {
//        UserAccount currentUser 
        userProfileUI = new UserProfileUI(this, userName);
        userProfileUI.setVisible(true);
        userProfileUI.setLocationRelativeTo(null);
        
    }
    
    public void navBackToMainMenu() {
        userProfileUI.dispose();
        parentNavCntl.showNavControl();
        
    }
    
}
