/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

/**
 *
 * @author drf5180
 */
public class SetBudgetCntl {
    private NavCntl parentNavCntl;
    private SetBudget budgetUI;
    
    public SetBudgetCntl(NavCntl theNavCntl, UserAccount theUser){
        parentNavCntl = theNavCntl;
        budgetUI = new SetBudget(this, theUser);
    }
    
    public void navToBudgetUI(){
       budgetUI.setVisible(true);
       budgetUI.setLocationRelativeTo(null);
    }
    
    public void navBackToMainMenu(){
        budgetUI.dispose();
      //  parentNavCntl.updateAccountTotValue();
        parentNavCntl.showNavControl();
    }
}
