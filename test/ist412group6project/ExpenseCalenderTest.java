/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

//
/**
 *
 * @author gme50
 */
public class ExpenseCalenderTest {
    
    public ExpenseCalenderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addExpenseToMonthMap method, of class ExpenseCalender.
     */
    @Test
    public void testAddExpenseToMonthMap() {
        System.out.println("addExpenseToMonthMap");
        String month = "August";
        Integer day = 23;
        Double expense = 40.02;
        ExpenseCalender instance = new ExpenseCalender("Checking");
        instance.addExpenseToMonthMap(month, day, expense);
        ArrayList<Double> expectedArrayList = new ArrayList<>();
        expectedArrayList.add(expense);
        assertEquals(expectedArrayList, instance.getExpensesOnSpecificDay(month, day));
    }

    /**
     * Test of getExpensesOnSpecificDay method, of class ExpenseCalender.
     */
    @Test
    public void testGetExpensesOnSpecificDay() {
        System.out.println("getExpensesOnSpecificDay");
        String month = "September";
        Integer day = 23;
        Double expectedExpense = 40.20;
        ExpenseCalender instance = new ExpenseCalender("Checking");
        instance.addExpenseToMonthMap(month, day, expectedExpense);
       
        ArrayList<Double> expResult = new ArrayList<>();
        expResult.add(expectedExpense);
        ArrayList<Double> result = instance.getExpensesOnSpecificDay(month, day);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getUserAccount method, of class ExpenseCalender.
     */
    @Test
    public void testGetUserAccount() {
        System.out.println("getUserAccount");
        ExpenseCalender instance = new ExpenseCalender("Checking");
        String expResult = "Checking";
        String result = instance.getUserAccount();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setUserAccount method, of class ExpenseCalender.
     */
    @Test
    public void testSetUserAccount() {
        System.out.println("setUserAccount");
        String userAccount = "Savings";
        ExpenseCalender instance = new ExpenseCalender("Checking");;
        instance.setUserAccount(userAccount);
        assertEquals(userAccount, instance.getUserAccount());
    }
    
}
