import java.util.*;

class MultipleCatchDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.print("Enter the number:");
		String s= sc.next();
		try{
			n=Integer.parseInt(s);

			int a[]=new int[n];
			System.out.print("Enter index to store value :");
			i=sc.nextInt();
			a[i]=1000;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Input is wrong....");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Can not store value...");
		}
		catch(Exception e)
		{
			System.out.println("Some Unknown Error");
		}
		finally
		{
			System.out.println("Program terminated....");
		}
	}
}


****/
C:\Users\student\Documents\New folder>javac MultipleCatchDemo.java

C:\Users\student\Documents\New folder>java MultipleCatchDemo
Enter the number:abc
Input is wrong....
Program terminated....

C:\Users\student\Documents\New folder>java MultipleCatchDemo
Enter the number:10
Enter index to store value :34
Can not store value...
Program terminated....

C:\Users\student\Documents\New folder>java MultipleCatchDemo
Enter the number:10
Enter index to store value :1
Program terminated....

/****







