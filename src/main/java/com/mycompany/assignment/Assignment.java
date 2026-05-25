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
        
         System.out.println(" ");
         
         System.out.print("=====Welcome to QuickChat=====");
         
         System.out.println(" ");
         
         //Asking for number of messages
         System.out.print("\nHow many messages would you like to send?");
         int maxMessages = input.nextInt();
         input.nextLine();
          
         System.out.println(" ");
         
         int choice = 0;
         
         //menu loop
         while(choice!= 3){
        
        System.out.println("=====Menu=====");
        System.out.println("1.Send Message");
        System.out.println("2.Show recently sent messages");
        System.out.println("3.Quit");
        
        System.out.println(" ");
        
        System.out.println("Choose option");
        choice = input.nextInt();
        input.nextLine();
        
        System.out.println(" ");
        
        switch(choice){
            case 1:
                //check message limit
                if(Messages.returnTotalMessages()
                        >=maxMessages){
                    System.out.println("Message limit reached");
                    break;
                }
                //Get recipient
                System.out.println("Enter Recipient number");
                String Recipient = input.nextLine();
                System.out.println(" ");
                
                //get message text
                System.out.println("Enter your Message");
                String text = input.nextLine();
                
                //creating and calling the Messages method
                Messages msg = new Messages(Recipient,text);
                
                //Validate recipient
                if(!msg.checkRecipientCell()){
                    System.out.println("Cell Number incorrectly formatted.");
                    break;
                }
                //Validate message lenght 
                if(!msg.checkMessageLength()){
                    System.out.println("Please enter a message of less than 250 characters");
                    break;
                }
                
                //Message options
                System.out.println("\n=====Choose=====");
                System.out.println("1.Send Message");
                System.out.println("2.Disregard Message");
                System.out.println("3.Store Message");
                
                int option = input.nextInt();
                input.nextLine();
                
                switch(option){
                    case 1:
                        System.out.println("Message successfully sent");
                        msg.printMessage();
                        break;
                        
                    case 2:
                        System.out.println("Press 0 to delete message");
                        int delete = input.nextInt();
                        if(delete == 0){
                            System.out.println("Message deleted");
                        }
                       input.nextLine();
                       break;
                       
                    case 3:
                        System.out.println("Message successfully stored");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                break;
                
            case 2:
                System.out.println("Coming Soon");
                break;
                
            case 3: 
                System.out.println("\nTotal messages sent:" + Messages.returnTotalMessages());
                System.out.println("Exiting QuickChat....");
                break;
            default:
                System.out.println("Invalid menu option");
    }
    }
         
}//end of main method
}//end of class

  