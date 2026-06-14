package com.mycompany.assignment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */import java.util.Scanner;
  import java.io.FileWriter;

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
          
         //arrays
         Messages[] sentMessages = new Messages[maxMessages];
         Messages[] storedMessages = new Messages[maxMessages];
         Messages[] disregardedMessages = new Messages[maxMessages];
         
         //Counters
         int sentCount = 0;
         int storedCount = 0;
         int disregardedCount = 0;
         
         System.out.println(" ");
         
         int choice = 0;
         
         //menu loop
         while(choice!= 4){
        
        System.out.println("=====Menu=====");
        System.out.println("1.Send Message");
        System.out.println("2.Show recently sent messages");
        System.out.println("3.Stored Messages");
        System.out.println("4. Quit");
        
        System.out.println(" ");
        
        System.out.println("Choose option");
        choice = input.nextInt();
        input.nextLine();
        
        System.out.println(" ");
        
        Messages msg = null;
        
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
                 msg = new Messages(Recipient,text);
                
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
                        sentMessages[sentCount] = msg;
                        sentCount++;
                        System.out.println("Message successfully sent");
                        msg.printMessage();
                        break;
                        
                    case 2:
                        System.out.println("Press 0 to delete message");
                        int delete = input.nextInt();
                        if(delete == 0){
                            disregardedMessages[disregardedCount] = msg;
                            disregardedCount++;
                            System.out.println("Message deleted");
                        }
                       input.nextLine();
                       break;
                       
                    case 3:
                        System.out.println("\n===Stored Messages Menu===");
                        System.out.println("1. Display Stored Messages");
                        System.out.println("2. Display longest Message");
                        System.out.println("3. Search by Message ID");
                        System.out.println("4. Search by Recipient");
                        System.out.println("5. Delete by Message Hash");
                        System.out.println("6. Full Report");
                         
                        int storedChoice = input.nextInt();
                        input.nextLine();
                        
                        switch(storedChoice){
                            case 1:
                             for(int i = 0; i< storedCount; i++){
                                 if(storedMessages[i] !=null){
                                     storedMessages[i].printMessage();
                                 }
                             }  
                             break;
                             
                            case 2:
                                String longest = storedMessages[0].getMessage();
                                for (int i = 1; i<storedCount; i++){
                                    if(storedMessages[i].getMessage().length()> longest.length()){
                                        longest = storedMessages[i].getMessage();
                                    }
                                }
                                System.out.println("Longest Message");
                                System.out.println(longest);
                                
                                break;
                                
                            case 3:
                                System.out.print("Enter Message ID:");
                                String searchID = input.nextLine();
                                for(int i = 0; i<storedCount; i++){
                                    if(storedMessages[i].getMessageID().equals(searchID)){
                                        System.out.println(storedMessages[i].getRecipient());
                                        System.out.println(storedMessages[i].getMessage());
                                    }
                                }
                                break;
                                
                            case 4:
                                System.out.print("Enter Recipient");
                                String recipientSearch = input.nextLine();
                                for(int i = 0; i<storedCount; i++){
                                    if(storedMessages[i].getRecipient().equals(recipientSearch)){
                                        System.out.println(storedMessages[i].getMessage());
                                    }
                                }
                                break;
                                
                            case 5:
                                System.out.print("Enter Message Hash");
                                String hash = input.nextLine();
                                for(int i = 0; i<storedCount; i++){
                                    if(storedMessages[i].getMessageHash().equals(hash)){
                                        storedMessages[i] = null;
                                        System.out.println("message deleted");
                                    }
                                }
                                break; 
                                
                            case 6:
                                for(int i = 0; i<storedCount; i++){
                                    if(storedMessages[i] != null){
                                    storedMessages[i].printMessage();
                                    
                                }
                                }
                                try{FileWriter writer = new FileWriter("storedMessages.json", true);
                                writer.write("{\n");
                                writer.write("\"MessageID\":\"" + msg.getMessageID() +"\",\n");
                                
                                writer.write("\"MessageHash\":\"" + msg.getMessageHash() + "\",\n");
                                
                                writer.write("\"Recipient\":\"" + msg.getRecipient() + "\".\n");
                                
                                writer.write("\"Message\":\"" + msg.getMessage() + "\", \n");
                                writer.write("}\n");
                                writer.close();
                                
                              
                                        }catch(Exception e){
                                            System.out.println("Error writing to JSON file");
                                        }
                                break;
                                
                        }
                        
                        
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

  