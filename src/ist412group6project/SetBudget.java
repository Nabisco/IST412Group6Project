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
public class SetBudget extends javax.swing.JFrame {
    private SetBudgetCntl controller;
    private UserAccount user;
    private double monthlyIncome;
    private double utilitiesBudgetTot;
    private double groceriesBudgetTot;
    private double savingsBudgetTot;
    /**
     * Creates new form SetBudget
     */
    public SetBudget(SetBudgetCntl cntl, UserAccount user) {
        
        controller = cntl;
        this.user = user; 
        monthlyIncome = user.getMonthlyIncome();
        
        utilitiesBudgetTot = (monthlyIncome * 0.5);
        groceriesBudgetTot = (monthlyIncome * 0.3);
        savingsBudgetTot = (monthlyIncome * 0.2);
        
        initComponents();
        updateUserExpenses();
        calculateBalance();
    }
    
     public SetBudget(){
        initComponents();
    }
    
    public void updateUserExpenses() {
        incomeTextField.setText(Double.toString(monthlyIncome));
        utilitiesTextField.setText(Double.toString(utilitiesBudgetTot));
        foodTextField.setText(Double.toString(groceriesBudgetTot));
        personalTextField.setText(Double.toString(savingsBudgetTot));
        utilitiesExpensesField.setText(user.getExpenceCallender().getExpensesCategory("Dec", ExpenseCalender.transactionType.UTILITY).toString());
        groceryExpensesField.setText(user.getExpenceCallender().getExpensesCategory("Dec", ExpenseCalender.transactionType.GROCERY).toString());
        savingsDepositsField.setText(user.getExpenceCallender().getExpensesCategory("Dec", ExpenseCalender.transactionType.CUSTOM).toString());
        
        double totalMonthlyExpenses = user.getExpenceCallender().getExpensesCategory("Dec", ExpenseCalender.transactionType.UTILITY) 
                + user.getExpenceCallender().getExpensesCategory("Dec", ExpenseCalender.transactionType.GROCERY)
                + user.getExpenceCallender().getExpensesCategory("Dec", ExpenseCalender.transactionType.CUSTOM);
        
        monthlyExpensesField.setText(Double.toString(totalMonthlyExpenses));
    }
    
    /*
    
    foodTextField.setText(user.getExpenceCallender().getExpensesCategory("Dec", ExpenseCalender.transactionType.GROCERY).toString());
        utilitiesTextField.setText(user.getExpenceCallender().getExpensesCategory("Dec", ExpenseCalender.transactionType.UTILITY).toString());
        personalTextField.setText(user.getExpenceCallender().getExpensesCategory("Dec", ExpenseCalender.transactionType.PERSONAL).toString());
        
    */
    
    public void calculateBalance(){
        double tempIncome = Double.parseDouble(incomeTextField.getText());
        double tempFood =   Double.parseDouble(foodTextField.getText());
        double tempUtil =   Double.parseDouble( utilitiesTextField.getText());
        double tempPersonal =  Double.parseDouble(personalTextField.getText());
        double tempbalance  = (tempIncome - (tempFood + tempUtil + tempPersonal));
        
    }
    
   


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        incomeTextField = new javax.swing.JTextField();
        foodTextField = new javax.swing.JTextField();
        utilitiesTextField = new javax.swing.JTextField();
        personalTextField = new javax.swing.JTextField();
        groceryExpenses = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        checkButton = new javax.swing.JButton();
        monthlyExpensesLabel = new javax.swing.JLabel();
        utilitiesExpensesLabel = new javax.swing.JLabel();
        savingsDepositsLabel = new javax.swing.JLabel();
        monthlyExpensesField = new javax.swing.JTextField();
        groceryExpensesField = new javax.swing.JTextField();
        utilitiesExpensesField = new javax.swing.JTextField();
        savingsDepositsField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Groceries:");

        jLabel2.setText("Utilities:");

        jLabel3.setText("Savings:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Monthly Budget");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setText("Monthly Income:");

        incomeTextField.setEditable(false);
        incomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeTextFieldActionPerformed(evt);
            }
        });

        foodTextField.setEditable(false);

        utilitiesTextField.setEditable(false);

        personalTextField.setEditable(false);

        groceryExpenses.setText("Grocery Expenses:");

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        checkButton.setText("Check Balance");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        monthlyExpensesLabel.setText("Monthly Expenses:");

        utilitiesExpensesLabel.setText("Utilities Expenses:");

        savingsDepositsLabel.setText("Savings Deposits:");

        monthlyExpensesField.setEditable(false);
        monthlyExpensesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyExpensesFieldActionPerformed(evt);
            }
        });

        groceryExpensesField.setEditable(false);
        groceryExpensesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groceryExpensesFieldActionPerformed(evt);
            }
        });

        utilitiesExpensesField.setEditable(false);

        savingsDepositsField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(homeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(utilitiesTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(foodTextField)
                                    .addComponent(incomeTextField)
                                    .addComponent(personalTextField))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(savingsDepositsLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(savingsDepositsField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(monthlyExpensesLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(monthlyExpensesField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(utilitiesExpensesLabel)
                                            .addComponent(groceryExpenses))
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(utilitiesExpensesField, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                            .addComponent(groceryExpensesField))))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(incomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthlyExpensesLabel)
                            .addComponent(monthlyExpensesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(foodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groceryExpenses)
                            .addComponent(groceryExpensesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(utilitiesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(utilitiesExpensesLabel)
                            .addComponent(utilitiesExpensesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(personalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(savingsDepositsLabel)
                        .addComponent(savingsDepositsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeButton)
                    .addComponent(checkButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
      controller.navBackToMainMenu();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void incomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeTextFieldActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here:
        calculateBalance();
    }//GEN-LAST:event_checkButtonActionPerformed

    private void monthlyExpensesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyExpensesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthlyExpensesFieldActionPerformed

    private void groceryExpensesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groceryExpensesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groceryExpensesFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SetBudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetBudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetBudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetBudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetBudget().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkButton;
    private javax.swing.JTextField foodTextField;
    private javax.swing.JLabel groceryExpenses;
    private javax.swing.JTextField groceryExpensesField;
    private javax.swing.JButton homeButton;
    private javax.swing.JTextField incomeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField monthlyExpensesField;
    private javax.swing.JLabel monthlyExpensesLabel;
    private javax.swing.JTextField personalTextField;
    private javax.swing.JTextField savingsDepositsField;
    private javax.swing.JLabel savingsDepositsLabel;
    private javax.swing.JTextField utilitiesExpensesField;
    private javax.swing.JLabel utilitiesExpensesLabel;
    private javax.swing.JTextField utilitiesTextField;
    // End of variables declaration//GEN-END:variables
}
