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
    FileInputStream fis;
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;
    
    public Serialize() {
        
        //Create file output stream
        try {
            fos = new FileOutputStream("C:\\Users\\gme50\\Documents\\NetBeansProjects\\IST412Group6Project\\data.ser");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Create file input stream
        try {
            fis = new FileInputStream("C:\\Users\\gme50\\Documents\\NetBeansProjects\\IST412Group6Project\\data.ser");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //create object output stream
        try {
            outputStream = new ObjectOutputStream(fos);
            
        } catch (IOException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Create object input stream
        try {
            inputStream = new ObjectInputStream(fis);
        } catch (IOException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean checkForSerializedData(){
        
        return false;
    }
    public void serializeObject(Object o) {
        try {
            outputStream.writeObject(o);
        } catch (IOException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Failed");
        }
    }
    
    public Member deserializeObject(String u) {
        Member ua = null;
        try {
            ua = (Member)inputStream.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ua;
        
    }
    
     public Object deserializeObject(Object o, UserList ul) {
        try {
            o = (UserList)inputStream.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
        return o;
        
    }
     
     public ArrayList deserializeObject(ArrayList al) {
        ArrayList alf = new ArrayList<UserAccount>();
         try {
            while(inputStream.available() > 0) {
                alf = (ArrayList)inputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Serialize.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alf;
        
    }
     
     
    
}
