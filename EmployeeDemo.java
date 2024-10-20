import java.util.Scanner;

class Employee
{
	String name;
	int year;
	String addr;
	Employee(String n,int y,String a)
	{
		name=n;
		year=y;
		addr=a;
	}
	public void print()
	{
		System.out.println(name+"\t"+year+"\t"+addr);
	}
}

class EmployeeDemo
{
	public static void main(String[] args)
	{
		Employee e1=new Employee("paras",1994,"Ratnagiri");
		Employee e2=new Employee("Suyash",2000,"Sangmeshwar");
		Employee e3=new Employee("soham",1999,"AABC");
		System.out.println("Name\t Year \tAddress");
		e1.print();
		e2.print();
		e3.print();
	}
}

OUTPUT:
C:\Users\student\Documents\javapractice>javac EmployeeDemo.java

C:\Users\student\Documents\javapractice>java EmployeeDemo
Name   Year    Address
paras  1994    Ratnagiri
suyash    2000    Sangmeshwar
soham 1999    AABC

	