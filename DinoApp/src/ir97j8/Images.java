/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir97j8;


import javax.swing.ImageIcon;
import javax.swing.*;

/**
 *
 * @author Nyulasi Ákos
 */
public abstract class Images extends FileIO {
    static String path = System.getProperty("user.dir") + "\\src\\Images\\";
    static String format = ".jpg";
    
        public static void setImage( JLabel label, String name){
        
            ImageIcon image = new ImageIcon(path + name + format);

            label.setIcon(image);
         
           
        
        
    }
}
