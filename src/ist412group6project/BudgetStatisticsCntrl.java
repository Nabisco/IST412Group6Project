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
public class BudgetStatisticsCntrl {
    private NavCntl parentNavCntl;
    private BudgetStatistics budgetStatisticsUI;
    

    public BudgetStatisticsCntrl(NavCntl theNavCntl, UserAccount theUser) {
        parentNavCntl = theNavCntl;
        budgetStatisticsUI = new BudgetStatistics(this, theUser);
        
        
    }
    
    public void navToBudgetStatistics() {
        budgetStatisticsUI.setVisible(true);
        budgetStatisticsUI.setLocationRelativeTo(null);
    }
    
    public void navBackToMainMenu() {
        budgetStatisticsUI.dispose();
        parentNavCntl.showNavControl();
        
    }
    
    
}
