/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

/**
 *
 * @author Computer
 */
public class ExpenseCntl {
    private NavCntl parentNavCntl;
    private ExpenseUI theExpenseUI;
    

    public ExpenseCntl(NavCntl theNavCntl, UserAccount theUser) {
        parentNavCntl = theNavCntl;
        theExpenseUI = new ExpenseUI(this, theUser);  
        
        
    }
    
    public void navToExpenseUI() {
        theExpenseUI.setVisible(true);
        theExpenseUI.setLocationRelativeTo(null);
    }
    
    public void navBackToMainMenu() {
        theExpenseUI.dispose();
        parentNavCntl.showNavControl();
    }
    //
}
