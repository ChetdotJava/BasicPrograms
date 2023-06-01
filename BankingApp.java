import java.util.Scanner;
class BankAccount {
    double balance;
    double previousAmount;
    String customerName;
    String customerId;
    //constructor
    BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }
    //function to accept the deposits from the depositor
    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            previousAmount = amount;
        }
    }
    //function to keep the account of withdrawal
    void withdraw(double amount){
        if(amount > 0){
            balance -= amount;
            previousAmount = -amount;
        }
    }

    //to know the status of previous transaction - deposited or withdrawn
    void getPreviousTransaction(){
        if(previousAmount > 0){
            System.out.println(previousAmount+" Rupees Have Been Deposited ");
        }
        else if(previousAmount < 0){
            System.out.println(Math.abs(previousAmount)+" Rupees Have Been Withdrawn ");
        }
        else{
            System.out.println("No Transaction Has Been Made\nHave a Nice Day!!");
        }
    } 

    void showMenu(){
        char option = '\0';
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome "+customerName);
        System.out.println("Your ID : "+customerId+"\nHope You Are Wearing Mask And Safe From COVID-19 ");
        System.out.println("\nPress The Key To : ");
        System.out.println("A. Check Balance\nB. Deposit\nC. Withdraw\nD. Previous Transaction\nE. Exit");

        jump:while(true){
            System.out.println("=====================================================================================================");
            System.out.print("Enter the option : ");
            option = inp.next().charAt(0);
            System.out.println("=====================================================================================================\n");
            

            if(option=='A' || option=='a'){
                System.out.println("Your Current Balance is : "+balance);
            }
            else if(option=='B' || option=='b'){
                System.out.println("------------------------------------------------------------------------------------------------");
                System.out.print("Enter Amount to be Deposited :  ");
                double amount = inp.nextDouble();
                deposit(amount);
                System.out.println("------------------------------------------------------------------------------------------------");
            }
            else if(option=='C' || option=='c'){
                System.out.println("------------------------------------------------------------------------------------------------");
                System.out.print("Enter The Amount To be Withdrawn :  ");
                double amount = inp.nextDouble();
                if(balance > 0){
                withdraw(amount);
                }
                else{
                    System.out.println("You Don't Have Sufficient Amount To Withdraw");
                    continue jump;
                }
                System.out.println("------------------------------------------------------------------------------------------------");
                
            }
            else if(option=='D' || option=='d'){
                System.out.println("------------------------------------------------------------------------------------------------");
                getPreviousTransaction();
                System.out.println("------------------------------------------------------------------------------------------------");
            }
            else if(option=='E' || option=='e'){
                System.out.println("Thanks For Using Services ");
                System.exit(0);
            }
            
        }
    }
    
}
public class BankingApp{
    public static void main(String[] args){
        BankAccount bank = new BankAccount("Chetna Bansal","1001");
        bank.showMenu();
    }
}
