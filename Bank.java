package Banking;

import java.util.Scanner;

class BankAccount
{
Scanner sc=new Scanner(System.in);

int balance;
int previousTransaction;

void deposit(int amount)
{
if(amount!=0)
{
balance=balance+amount;
previousTransaction=amount;

}
}
void withdraw(int amount)
{
if(amount!=0)
{
balance=balance-amount;
previousTransaction = -amount;
}
}
void getpreviousTransaction()
{
if(previousTransaction > 0 )
{
System.out.println("Deposited:" +previousTransaction);
}
else if(previousTransaction < 0)
{
System.out.println("Withdrawn: " +Math.abs(previousTransaction));
}
else
{
System.out.println("No Transaction Occured");
}
}

void showMenu()
{
char option='\0';
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Name");
String customername=sc.next();
System.out.println("Enter your Customer ID");
int customerid=sc.nextInt();

System.out.println("Welcome "+customername);
System.out.println("your ID is "+customerid);
System.out.println("\n");
System.out.println("A.check Balance");
System.out.println("B.Deposit");
System.out.println("C.Withdraw");
System.out.println("D.PreviousTransaction ");
System.out.println("E.Exit");

do
{
System.out.println("****************************************************");
System.out.println("Enter an Option");
System.out.println("****************************************************");
option=sc.next().charAt(0);
System.out.println("\n");

switch(option)
{
case 'A' :
System.out.println("*************************************************");
System.out.println("Balance :" +balance);
System.out.println("*************************************************");
System.out.println("\n");
break;

case 'B':
System.out.println("****************************************************");
System.out.println("Enter an amount to deposit");
System.out.println("****************************************************");
int amount=sc.nextInt();
deposit(amount);
System.out.println("\n");
break;

case 'C':
System.out.println("****************************************************");
System.out.println("Enter an amount to Withdraw");
System.out.println("****************************************************");
int amount2=sc.nextInt();
withdraw(amount2);
System.out.println("\n");
break;

case 'D':
System.out.println("****************************************************");
getpreviousTransaction();
System.out.println("****************************************************");
System.out.println("\n");
break;

default:
System.out.println("Invalid Option! Please enter again");
break;
}


}while(option != 'E');

System.out.println("Thankyou for using our services");
sc.close();
}
}


public class Bank 
{

	public static void main(String[] args)  
	{
		BankAccount obj1 = new BankAccount();
		obj1.showMenu();
	}
	
}
