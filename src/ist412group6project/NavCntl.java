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
    
    
    public NavCntl(){
    
   theNavUI = new NavUI(this);
   theNavUI.setLocationRelativeTo(null);
   theNavUI.setVisible(true);
    
    
    }
    
    
}
