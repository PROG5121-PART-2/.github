/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task.pkg1;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author ST10195833
 */
public class Login {
   
public static boolean getUsername(String user){
     Pattern tr = Pattern.compile("[_]");
      boolean ourLength =false;
      boolean under = false;
      char r;
      for(int i = 0; i < user.length(); i++){
          r = user.charAt(i);
     
      }    if(user.length()<=5 || user.length()==5){
          ourLength = true; 
      }
             

      if(tr.matcher(user).find()&&ourLength){
      //Message
      System.out.print("Username successfully captured\n");
          return true;
  }
      //Message
      System.out.print("Username not successfully captured\n");
        return false;
       
}
public static boolean getPassword(String pass){
     Pattern tr = Pattern.compile("[@,#,%,$,!,^,&,*, ,/,?,<,>,:,',_,.,;,{,},]");
     Pattern PG = Pattern.compile("[QWERTYUIOPASDFGHJKLMNBVCXZ]");
     Pattern KM = Pattern.compile("[0123456789]");
      boolean ourLength =false;
      boolean specialChar = false;
      char r;
      for(int i = 0; i < pass.length(); i++){
          r = pass.charAt(i);
     
      }    if(pass.length()<=8 || pass.length()>=8){
          ourLength = true; 
      }
             

      if(PG.matcher(pass).find()&&ourLength&&tr.matcher(pass).find()&&KM.matcher(pass).find()){
       //Message   
      System.out.print("Password successfully captured\n");
          return true;
  }
      //Message
      System.out.print("Password not successfully captured\n");
        return false;
       
}

   }
   
  
   

   
    

      
