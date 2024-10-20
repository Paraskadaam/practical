class StudentRecord
{
String name;
int age;
String address;
StudentRecord()
{
name="Unknown";
age=0;
address="Not Available";
}
public void setInfo(String n,int a)
{
name=n;
age=a;
}
public void setInfo(String n,int a, String add)
{
name=n;
age=a;
address=add;
}
public void printData()
{
System.out.println(name+"\t"+age+"\t"+address);
}
public static void main(String args[])
{
StudentRecord s[]=new StudentRecord[3];
s[0]=new StudentRecord();
s[0].setInfo("Amit",12,"FAMT");
s[1]=new StudentRecord();
s[1].setInfo("Sumit",22,"goa");
s[2]=new StudentRecord();
s[2].setInfo("Rahul",25,"Shivajinagar");
System.out.println("Name\tAge\tAddress");
s[0].printData();
s[1].printData();
s[2].printData();
}
}
