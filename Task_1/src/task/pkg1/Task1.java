/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg1;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ST10195833
 */
public class Task1 {

 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     String pWord;
     String uName;
     //Variable
     int OM = 0;
     int AP = 0;
     //Request User info
     System.out.print("Enter first name>>>\n");
       String fName= input.nextLine();
     System.out.print("Enter last surname>>>\n");
      String lSurname = input.nextLine();
     do{System.out.print("Enter username>>>\n");
        uName = input.nextLine();
     }while(Login.getUsername(uName)!=true);
    do{ 
         System.out.print("Enter password>>>\n");
          pWord = input.nextLine();
     }while(Login.getPassword(pWord)!=true);
       
    
 while(OM!=3){  
    //Users option of EasyKanban 
    OM = Integer.parseInt(JOptionPane.showInputDialog("Welcome to EasyKanban "
            + "Menu \n"
            + "--------------------------------------------\n"
            + "1. Add task\n"
            + "2. Coming soon\n"
            + "3. Quit"));
    
    if(OM == 1){
        //Request the amount of task that is needed to add
        int all=Integer.parseInt(JOptionPane.showInputDialog(null,"How many task you want to add"));
    for(int u = 0; u < all; u++){ 
        //Request task name
     String PS = JOptionPane.showInputDialog(null,"Task name");
     //Request task number
    String TP = JOptionPane.showInputDialog(null,"Task number");
   
  String TD="";
   do{
       //Request task description
      TD =JOptionPane.showInputDialog(null,"Task Description");
   }while(!Task2.checkTaskDescription(TD));
  
   String DD = JOptionPane.showInputDialog(null,"Developer Details \n" + "Name"  +   "Surname");
    String TT = JOptionPane.showInputDialog(null,"Task Duration");
     String TID =JOptionPane.showInputDialog(null,"Task ID",Task2.createTaskID(PS, u, TD));
    String TS = JOptionPane.showInputDialog(null,"Task Status \n"
             + "1.To Do \n"
             + "2. Done \n"
             + "3. Doing");
    //Option for task 
   String select;
    if(AP == 1){
         select = "To Do";
 
                          
    }else if(AP==2){
        select = "Done";
    }else if (AP == 3){
        select = "Doing";
    } 
    //Results
    JOptionPane.showMessageDialog(null,"Task name : "+PS+"\n"+"Task number : "+TP+"\n"+"Task Description : "+TD+"\n"+"Developer Details : "+DD+"\n"+"Task Duration : "+TT+"\n"+"Task ID : "+TID+"\n"+"Task Status : "+TS); 
    }
}
    else if(OM == 2){
     JOptionPane.showMessageDialog(null,"COMING SOON");
    }
    //Quite the programme 
    else if(OM == 3){
     System.exit(OM);
    }else{
     JOptionPane.showMessageDialog(null,"Invaild Option.");
    }
        
}
}
}