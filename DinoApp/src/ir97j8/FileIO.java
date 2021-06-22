
package ir97j8;
/*
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Double.*;
import java.util.Scanner;
import java.util.ArrayList;
import static ir97j8.dinosaurs.*;

//Adatkezelési osztály
public abstract class FileIO {
   private static ArrayList<dinosaurs> dinos = new ArrayList<dinosaurs>();

   
   
   //egy dinoszauruszokból álló tömböt ad vissza
    public static ArrayList<dinosaurs> getDinos() {
        return dinos;
    }

  
        
      public static void CreateFile()
    {
    
        
        try {
      File myObj = new File("data.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
      
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
}
    
  
    //Metódus, amely a fileba az adatokat a megadott séma alapján felviszi.
    public static void WriteFile(String name, String type, String desc, Double length, Double height, Double weight){
  
    try {
      FileWriter myWriter = new FileWriter("data.txt", true);
      myWriter.write("\n");
      myWriter.write(name);
      myWriter.write(";");
      myWriter.write(type);
      myWriter.write(";");
      myWriter.write(desc);
      myWriter.write(";");
      myWriter.write(String.valueOf(length));
      myWriter.write(";");
      myWriter.write(String.valueOf(height));
      myWriter.write(";");
      myWriter.write(String.valueOf(weight));
      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
    //Metódus, amely egy dinosaurs-okból álló ArrayListbe olvassa a file sorait.
    public static ArrayList<dinosaurs> ReadFile( ArrayList<dinosaurs> dinoList){
        //String[] Dinosaurs = new String[3];
        
        try {
      File file = new File("data.txt");
      Scanner myReader = new Scanner(file);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] parts = data.split(";");
        String name = parts[0];
        String type = parts[1];
        String description = parts[2];
        Double length= parseDouble(parts[3]);
        Double height = parseDouble(parts[4]);
        Double weight = parseDouble(parts[5]);
        dinosaurs dino = GenerateDino(name, type, description, length, height, weight);
        dinoList.add(dino);
        
        
      }
      
      
      myReader.close();
      
    }
        catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      
    }
        
            return dinoList;
                    
                    
        
     
    }
    
   
}



    
    
