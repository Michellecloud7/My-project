package com.mycompany.assignment;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */import java.util.Random;

/**
 *
 * @author Mpho Mudau
 */
public class Messages {
    private String MessageID;
    private static int numMessagesSent = 0;
    private String Recipient;
    private String Message;
    private String MessageHash;
    
    //constructors
    public Messages( String Recipient, String Message){
        this.MessageID = generateMessageID();
        this.Recipient = Recipient;
        this.Message = Message;
        
        numMessagesSent++;
        
        this.MessageHash = createMessageHash();
       
    }
    //Generate random 10-digit ID
    private String generateMessageID(){
        Random random = new Random();
        
        long number = 1000000000 + 
                (long)(random.nextDouble() * 9000000000L);
        return String.valueOf(number);
    }
    //Validate recipient number
    public boolean checkRecipientCell(){
        if(Recipient.startsWith("+")&&
                Recipient.length()<=13){
            return true;
        }
        return false;
    }
    //Validate message lenght
    public boolean checkMessageLength(){
        if(Message.length()<=250){
            return true;
        }
        return false;
    }
    //Create message hash
    public String createMessageHash(){
        String firstTwo = 
                MessageID.substring(0,2);
        return firstTwo + ":" +
                numMessagesSent;
    }
    //Display message details
    public void printMessage(){
        System.out.println("\nMessage ID:" + MessageID);
        System.out.println("Message Hash:" + MessageHash);
        System.out.println("Recipient:" + Recipient);
        System.out.println("Message:" + Message);
    }
    //Get total messages sent
    public static int returnTotalMessages(){
        return numMessagesSent;
    }
}
