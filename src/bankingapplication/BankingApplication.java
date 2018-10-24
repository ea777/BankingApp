/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication;

import java.util.Scanner;

/**
 *
 * @author eyob
 */
public class BankingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount obj1 = new BankAccount("cvcv", "vgvhnvv");
        obj1.showMenu();
    }
}


    
       class BankAccount {
        int balance;
        int previousTransaction;
        String customerName;
        String customerId;
        
        BankAccount(String cname, String cid){
            customerName = cname;
            customerId = cid;
        }
        
        void deposit(int amount){
            if (amount > 0){
                balance = balance + amount;
                previousTransaction = amount;
                
            }
        }
        
        void withdraw(int amount){
            if (amount > 0){
             balance = balance - amount;
             previousTransaction = -amount;
             
            }
        }
        
        void getPreviousTransaction(){
            if (previousTransaction > 0){
                System.out.println("Deposites"+previousTransaction);
            }
            else if(previousTransaction < 0){
                System.out.println("Withdrawn"+ Math.abs(previousTransaction));
            }
            else {
                System.out.println("No transaction occurred");
            }
                
        }
        
        void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome"+ customerName);
       System.out.println("\n");  System.out.println("Your Id is"+ customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");
        
        
        do 
        {
            System.out.println("-------------------------------");
            System.out.println("Enter an option");
            System.out.println("================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");
            //break;
        
            switch(option)
            {
                case 'A':
                System.out.println("-------------------------------");
                System.out.println("Balance = "+ balance);
                System.out.println("\n");
                break;

                case 'B':
                System.out.println("-------------------------------");
                System.out.println("Enter an amount to deposit");
                System.out.println("-------------------------------");
                int amount = scanner.nextInt();
                deposit(amount); 
                System.out.println("\n");
                break;

                case 'C':
                System.out.println("-------------------------------");
                System.out.println("Enter an amount to withdraw");
                System.out.println("-------------------------------");
                int amount1 = scanner.nextInt();
                withdraw(amount1); 
                System.out.println("\n");
                break;

                case 'D':
                System.out.println("-------------------------------");
                getPreviousTransaction();
                System.out.println("-------------------------------");
                System.out.println("\n");
                break;


                case 'E':
                System.out.println("*******************");
                break;

                default:
                System.out.println("Invalid option");
                break;
            }
         
         
        } while (option != 'E');
        
        
      System.out.println("thank you for using our sevices");
      
        }
        
    }
    



    

      

        
        

    
    
                 
                 
        

    
    

              
            
    

             
          
        
      
        
        
        
       
    
        
    
        
                     
             
             
             
             
              
             
             
             
             
              
         
            
            
            
        
        
        
        
        
        
        

