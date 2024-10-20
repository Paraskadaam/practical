import java.util.*;
class NumberMethods
{
public static void main(String args[])
{
int n,c=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
n = sc.nextInt();
while(true)
{
System.out.println("1. Factorial\n2. Test Armstrong\n3. Test Palindrome\n4.

Test Prime\n5. Fibonacci Series\n6. Exit");

System.out.println("Please enter your choice:\n");
c=sc.nextInt();
if(c==6)
break;



switch(c)
{
case 1:
System.out.println("Factorial of "+n+"="+factorial(n));
break;
case 2:
testArmstrong(n);
break;
case 3:
if(isPalindrome(n))
System.out.println(n+" is palindrome");
else
System.out.println(n+" is not palindrome");
break;
case 4:
testPrime(n);
break;
case 5:
fibonacciSeries(n);
break;
default:
System.out.println("Invalid choice!!");
break;
}
}
}
public static int factorial(int n)
{
int f=1,i;
for(i=1;i<=n;i++)
f=f*i;
return f;
}
public static void testArmstrong(int n)
{
int t=n,s=0,d;
while(t!=0)
{
d=t%10;
s=s+d*d*d;
t=t/10;
}
if(s==n)
System.out.println(n+" is Armstrong");
else
System.out.println(n+" is not Armstrong");
}



public static void testPrime(int n) {
boolean f=true
;

int i;
for(i=
2;i<=(n/
2);i++)

{
if(n%i==
0
)

{
f=false
;
break
;

}
}
if(f)
System.out.println(n+

" is prime");

else
System.out.println(n+

" is not prime");

}
public static void fibonacciSeries(int n) {
int p1=
0,p2=
1,c,i;
System.out.print(p1+
"
"+p2);

for(i=
2;i<n;i++)
{
c=p1+p2;
System.out.print(
"
"+c);

p1=p2;
p2=c;
}
System.out.println();
}
public static boolean isPalindrome(int n) {
int r=
0,d,t;
t=n;
while(n!=
0
)

{
d=n%10
;
r=r*10+d;
n=n/10
;

}
if(r==t)
return true
;

else
return false
;

}
}

OUTPUT:
Enter
a number
5
1. Factorial
2. Test Armstrong
3. Test Palindrome
4. Test Prime
5. Fibonacci Series
6. Exit
Please enter your choice: 1
Factorial of 5=120
1. Factorial
2. Test Armstrong
3. Test Palindrome
4. Test Prime
5. Fibonacci Series
6. Exit
Please enter your choice: 25 is not Armstrong
1. Factorial
2. Test Armstrong
3. Test Palindrome
4. Test Prime
5. Fibonacci Series
6. Exit
Please enter your choice: 35 is palindrome
1. Factorial
2. Test Armstrong
3. Test Palindrome
4. Test Prime
5. Fibonacci Series
6. Exit
Please enter your choice: 45 is prime
1. Factorial
2. Test Armstrong
3. Test Palindrome
4. Test Prime



5. Fibonacci Series
6. Exit
Please enter your choice:
5
0 1 1 2 3
1. Factorial
2. Test Armstrong
3. Test Palindrome
4. Test Prime
5. Fibonacci Series
6. Exit
Please enter your choice:
6