/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmmachine;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Tejteju
 */
class ATM
{
    int withdrawalamount;
    int accountno;
    int balance;
    int depositamount;
    ATM()
    {
        withdrawalamount=0;
        accountno=0;
        balance=0;
        depositamount=0;
    }
    void read()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Ente the balance");
        balance=s.nextInt();
    }
    void withdraw()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw:");
        withdrawalamount=s.nextInt();
        if(withdrawalamount<=balance)
        {
            System.out.println("You have successfully withdrawed the amount from your account");
            balance=balance-withdrawalamount;
            System.out.println("The balance is :"+ balance);
        }
        else
        {
            System.out.println("You don't have enough balance to withdraw");
        }
    }
    void deposit()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the amount you want to depoist:");
       depositamount=s.nextInt();
       balance = balance + depositamount;
       System.out.println("The balance is after depositing :"+balance);
        
    }
    void checkbalance()
    {
        System.out.println("Your balance is:"+ balance);
    }
}
class userbankaccount extends ATM
{
    userbankaccount()
    {
        super();
    }
    void modify()
    {
        Scanner s =new Scanner(System.in);
        super.read();
        System.out.println("The balance after modifying is :"+balance);
        
    }
}
public class ATMmachine {

    public static void main(String[] args) {
        int ch;
        Scanner s = new Scanner(System.in);
        ATM a= new ATM();
        a.read();
         userbankaccount c =new  userbankaccount();
   
        do
        {
             System.out.println("Enter 1 for withdrawal 2 for deposit 3 for checkbalance 4 to modify");
            System.out.println("Enter the choice:");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:
                  a.withdraw(); 
                  break;
                case 2:
                    a.deposit();
                      break;
                case 3:
                    a.checkbalance();
                      break;
                case 4:
                         c.modify();
                         break;
                case 5:
                    exit(0);
                    break;
                default:
                    System.out.println("Invalid case");
                    break;
            }
        }while(ch!=6);
       
    }
    
}
