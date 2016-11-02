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
    private HashMap<String, HashMap<Integer, ArrayList<Double>>> year; //outer key is for month, nested hashmap contains a keyset of dates and an arraylist of expenses
    private String userAccount;


    public ExpenseCalender(String newAccount) {
        userAccount = newAccount;
        
        year = new HashMap<>();
        HashMap<Integer, ArrayList<Double>> emptyMonthMap = new HashMap();
        year.put("January", emptyMonthMap);
        year.put("February", emptyMonthMap);
        year.put("March", emptyMonthMap);
        year.put("April", emptyMonthMap);
        year.put("May", emptyMonthMap);
        year.put("June", emptyMonthMap);
        year.put("July", emptyMonthMap);
        year.put("August", emptyMonthMap);
        year.put("September", emptyMonthMap);
        year.put("October", emptyMonthMap);
        year.put("November", emptyMonthMap);
        year.put("December", emptyMonthMap);
        
    }
    
    public void addExpenseToMonthMap(String month, Integer day, Double expense) {
        if(!year.get(month).containsKey(day)){
            ArrayList<Double> firstDayExpense = new ArrayList<>();
            firstDayExpense.add(expense);
            year.get(month).put(day, firstDayExpense);
        }
        else {
            year.get(month).get(day).add(expense);
        }
        
    }
    
    public ArrayList<Double> getExpensesOnSpecificDay(String month, Integer day) {
        if( year.get(month).containsKey(day)) {
            return year.get(month).get(day);
        } 
        else {
            ArrayList<Double> emptyList = new ArrayList<>();
            emptyList.add(0.00);
            return emptyList;
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
