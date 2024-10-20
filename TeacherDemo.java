import java.util.*;

	class Teacher
	{
		String name;
		double salary;
		Teacher(String n,double s)
		{
			name=n;
			salary=s;
		}
		public void display()
		{
			System.out.println("Name="+name);
			System.out.println("Salary="+salary);
		}
	}
		class  AssociateProfessor extends Teacher
		{
			double bonus;
			AssociateProfessor(String n,double s,double b)
			{
				super(n,s);
				bonus=b;
			}
			public void showInfo()
			{
				display();
				System.out.println("Bonus="+bonus);
			}
		}
		class TeacherDemo
		{
			public static void main(String[] args)
			{
				AssociateProfessor a=new AssociateProfessor("Dr pradeep Roy",20000,2000);
				a.showInfo();
			}
		}

OUTPUT:
C:\Users\student\Documents\javapractice>javac TeacherDemo.java

C:\Users\student\Documents\javapractice>java TeacherDemo
Name=Dr pradeep Roy
Salary=20000.0
Bonus=2000.0