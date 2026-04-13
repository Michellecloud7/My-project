/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

/**
 *
 * @author Mpho Mudau
 */
public class Login {
    private String Username;
    private String password;
    private String Cellnumber;
    
    //constructor
    public Login(String Username, String password, String Cellnumber){
        this.Username = Username;
        this.password = password;
        this.Cellnumber = Cellnumber;
    }
    
    //Getters
    public String getUsername(){
        return Username;
    }
    public String getpassword(){
        return password;
    }
    public String getCellnumber(){
        return Cellnumber;
    }
    
    //Username: must contain "_" and 5 or less characters
    public static boolean UsernameChecker(String Username){ 
      return Username.length()<=5&&Username.contains("_");
    
}
    //Password: 8 characters, capital letter, number, and a special character
    public static boolean passwordChecker(String password){
        String pattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).{8,}$";
        return password.matches(pattern);
    }
    //SA cellnumber must start with +27 and 9 digits after
     public static boolean CellnumberChecker(String Cellnumber){
         String pattern = "^\\+27(0)[0-9]{9}$";
         return Cellnumber.matches(pattern);
     }
     //Login check method
     public boolean loginUser(String enteredUsername, String enteredpassword){
             return Username.equals(enteredUsername)&& password.equals(enteredpassword);
         }
    }
    
    
    
    
    
    

