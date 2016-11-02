/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412group6project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gme50
 */
public class Serialize {
    
    private FileOutputStream fos;
    private FileInputStream fis;
    public ObjectOutputStream outputStream;
    public ObjectInputStream inputStream;
    
    public Serialize() {
         
        
        
        
        
        
        
        
    }
    
    public void openOutputStream() {
        //Create file output stream
       try {
            fos = new FileOutputStream("C:\\Users\\gme50\\Documents\\NetBeansProjects\\IST412Group6Project\\data.ser");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //create object output stream
        try {
            outputStream = new ObjectOutputStream(fos);
            
        } catch (IOException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void closeOutputStream() {
        try {
            outputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void openInputStream() {
        
        //Create file input stream
        try {
            fis = new FileInputStream("C:\\Users\\gme50\\Documents\\NetBeansProjects\\IST412Group6Project\\data.ser");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Create object input stream
        try {
            inputStream = new ObjectInputStream(fis);
        } catch (IOException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void closeInputStream() {
        try {
            inputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
