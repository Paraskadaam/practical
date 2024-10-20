import java.util.Scanner;

class Account
{
String name;
String acc;
double balance;
double rate;
String contact;
String addr;
Account()
{
balance=0;
rate=2.5;
System.out.print("Name:");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
System.out.print("Account:");
acc=sc.nextLine();
System.out.print("Contact:");
contact=sc.nextLine();
System.out.print("Address:");
addr=sc.nextLine();
}
void deposit(double money)
{
	balance=balance+money;
	display();
}
void withdraw(double money)
{
	if(balance<money)
	System.out.print("Balance is low!");
	else
	balance=balance-money;
	display();
}
void computeInterest()
{
balance=balance+(balance*rate)/100;
display();
}
void display()
{
System.out.print("Balance:"+balance);
}
}
class Banking

{
public static void main(String[] args)
{
int ch=0;
Account a=new Account();
Scanner sc=new Scanner(System.in);
while(ch!=5)
{
	System.out.println("1:deposit\n2:withdraw\n3:Calculate interest\n4:Display Balance\n5:Exit\n");
System.out.print("Choice:");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter deposit number");
a.deposit(sc.nextDouble());
break;
case 2:
System.out.println("Enter Withdraw number");
a.withdraw(sc.nextDouble());
break;
case 3:

a.computeInterest();
break;
case 4:
a.display();
break;
case 5:
System.out.println("Exit the Application");
break;
default:
System.out.print("Invalid Choice");
}
}
}
}


Output:

C:\Users\student\Documents\javapractice>javac Banking.java

C:\Users\student\Documents\javapractice>java Banking
Name:paras
Account:12846636
Contact:2645355333
Address:agsf
1:deposit
2:withdraw
3:Calculate interest
4:Display Balance
5:Exit















