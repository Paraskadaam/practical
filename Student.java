import java.util.Scanner;

class StudentRecord
{
	String name;
	int age;
	StudentRecord()
	{
		name="unknown";
		age="0";
		address="npt available";
	}
void setInfo(String n,int a)
{
	name=n;
	age=a;
}

void setInfo(String n,int a,String addr)
{
	name=n;
	age=a;
	address=addr;
}

void printData()
{
	System.out.println(name+"\t"+age"\t"+address);
}


}
class Student
{
	public void main (String[] args)
	{
		StudentRecord s[]=new StudentRecord[3];
		s[0]=new studentRecord();
		s[0].setInfo("ram",16);
		s[0].printData();
		s[1]=new studentRecord();
		s[1].setInfo("atharv",15,"dubai");
		s[1].printData();
		s[2]=new studentRecord();
		s[2].setInfo("shyam",14);
		s[2].printData();
		s[3]=new studentRecord();
		s[3].setInfo("vinit",13);
		s[3].printData();



