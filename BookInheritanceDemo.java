class Book
{
	String name;
	String author;
	int pages;
	Book(String n,String a,int p)
	{
		name=n;
		author=a;
		pages=p;
	}
	public void display()
	{
		System.out.println("Name="+name);
		System.out.println("Author="+author);
		System.out.println("No of pages="+pages);
	}
}
class RefBook extends Book
{
	double price;
	RefBook(String n,String a,int p,double pr)
	{
		super(n,a,p);
		price=pr;
	}
	public void display()
	{
		super.display();
		System.out.println("Price="+price);
	}
}
class Magzine extends Book
{
	double issue;
	Magzine(String n ,String a,int p,double i)
	{
		super(n,a,p);
		issue=i;
	}
	public void display()
	{
		super.display();
		System.out.println("Issue="+issue);
	}
}
class BookInheritanceDemo
{
	public static void main(String[] args)	
	{
		RefBook rb=new RefBook("Let us C","YPK",500,300);
		rb.display();
		Magzine ab=new Magzine("Sports","Yash",50,2);
		ab.display();
	}
}

Output:
C:\Users\student\Documents\javapractice>javac BookInheritanceDemo.java

C:\Users\student\Documents\javapractice>java BookInheritanceDemo
Name=Let us C
Author=YPK
No of pages=500
Price=300.0
Name=Sports
Author=Yash
No of pages=50
Issue=2.0