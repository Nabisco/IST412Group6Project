/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author gme50
 */
public class ExpenseCalender implements Serializable{
    private HashMap<String, HashMap<transactionType, ArrayList<Double>>> year; //outer key is for month, nested hashmap contains a keyset of dates and an arraylist of expenses
    private String userAccount;
    public enum transactionType {
        UTILITY, GROCERY, SAVING, CUSTOM;
    }
    


    public ExpenseCalender(String newAccount) {
        userAccount = newAccount;
        
        year = new HashMap<>();
        HashMap<transactionType, ArrayList<Double>> emptyMonthMap = new HashMap();
        year.put("Jan", emptyMonthMap);
        year.put("Feb", emptyMonthMap);
        year.put("Mar", emptyMonthMap);
        year.put("Apr", emptyMonthMap);
        year.put("May", emptyMonthMap);
        year.put("Jun", emptyMonthMap);
        year.put("Jul", emptyMonthMap);
        year.put("Aug", emptyMonthMap);
        year.put("Sep", emptyMonthMap);
        year.put("Oct", emptyMonthMap);
        year.put("Nov", emptyMonthMap);
        year.put("Dec", emptyMonthMap);
        
    }
    
    public void addExpenseToMonthMap(String month, transactionType type, Double expense) {
        if(!year.get(month).containsKey(type)){
            ArrayList<Double> firstDayExpense = new ArrayList<>();
            firstDayExpense.add(expense);
            year.get(month).put(type, firstDayExpense);
        }
        else {
            year.get(month).get(type).add(expense);
        }
        
    }
    
    public Double getExpensesCategory(String month, transactionType type) {
        double totalExpenses = 0.00;
        if( year.get(month).containsKey(type)) {
            //return year.get(month).get(type);
            for(Double d : year.get(month).get(type)) {
                totalExpenses += d;
            }
            
            return totalExpenses;
        } 
        else {
            
            return 0.0;
        }
    }

    /**
     * @return the userAccount
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * @param userAccount the userAccount to set
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    
    

}
