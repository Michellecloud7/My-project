package com.mycompany.assignment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */import java.util.Scanner;
  

/**
 *
 * @author Mpho Mudau
 */
//
public class Assignment {//start of class

    public static void main(String[] args) {//Start of main method
        Scanner input = new Scanner(System.in);
        
        System.out.println("===Registration===");
        
        System.out.println(" ");
        
        //Username
        System.out.println("Please enter your Username:");
        String Username = input.nextLine();
        if(Login.UsernameChecker(Username)){//Username validator
            
    System.out.println("Username successfully captured");
    } else{
    System.out.println("Username not correctly formatted");
            return;
}   
        System.out.println(" ");
        
        //Password
        System.out.println("Please enter your password:");
        String password = input.nextLine();
        if (Login.passwordChecker(password)){//password vaildator
        System.out.println("password successfully captured");
    } else{ 
            System.out.println("password is not correctly formatted; please ensure that the password contains atleast eight characters, a capital letter, a number, and a special character");
            return;
    }
        System.out.println(" ");
        
        //Cell number
        System.out.println("Please enter your Cellnumber:+27");
        String Cellnumber = input.nextLine();
        
         if (Login.CellnumberChecker(Cellnumber)){//cellnumber vaildator
        System.out.println("Cellnumber successfully captured");
        
    } else {
            System.out.println("Cellnumber is not correctly formatted or does not contain international code");
            return;
            }
            System.out.println(" ");
            
         //Store User
      Login user = new Login(Username,password,Cellnumber);
                    
         System.out.println("===Registration complete===");
         
         System.out.println(" ");
         
         System.out.println("=====Login====");
         
         System.out.println("Enter your Username");
         String loginUser = input.nextLine();
         
         System.out.println(" ");
         
         System.out.println("Enter your password");
         String loginpass = input.nextLine();
         
         if(user.loginUser(loginUser, loginpass)){
             System.out.println("Welcome" + " " + user.getUsername());
         }
         else {
             System.out.println("Incorrect username or password");
         }
         
                 
         
    }//end of main method
}//end of class

  