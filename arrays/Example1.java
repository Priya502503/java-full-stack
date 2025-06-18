/*PROGRAM 1

class Example1
{
public static void main(String[] args)
{
int i;
for(i=1;i<=10;i++)
{
System.out.println("Bright IT career");
}
}}

PROGRAM 2

class Example1
{
public static void main(String[] args)
{
int i=1;
while(i<=20)
{
System.out.println(i);
i++;
}}
}
PROGRAM 3
 
import java.util.Scanner;
class Example1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a value:");
int a=sc.nextInt();
System.out.println("enter  b value:");
int b=sc.nextInt();
{
if(a==b)
{
System.out.println("equal");
}
else
{
System.out.println("not equal");
}}
}}
PROGRAM 4
 
import java.util.Scanner;
class Example1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int a=sc.nextInt();
if(a%2==0)
{
System.out.print("even");
}
else{
System.out.println("odd");
}
}
} 
PROGRAM 5
 
import java.util.Scanner;
class Example1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter a,b,c values:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b&&a>c)
{
System.out.print("a is greater");
}
if(b>c&&b>a)
{
System.out.println("b is greater");
}
else{
System.out.println("c is greater");
}
}
}
 PROGRAM 6 

class Example1
{
public static void main(String[] args)
{
int i=10;
while(i<=100)
{
if(i%2==0)
{
System.out.println(i);
}
i++;
}}
}

PROGRAM 7 
import java.util.Scanner;
class Example1
{
public static void main(String[] args)
{
int i=1;
do
{
System.out.println(i);
i++;
}
while(i<=10);
}
}

PROGRAM 8 
import java.util.Scanner;
class Example1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int m=sc.nextInt();
int sum=0;
int n=m;
while(m>0)
{
int rem=0;
rem=rem+m%10;
sum=sum+(rem*rem*rem);
m=m/10;
}
if(n==sum)
{
System.out.println("armstrong number");
}
else{
System.out.println("not armstrong number");
}
}}

PROGRAM 9 */
import java.util.Scanner;
class Example1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();
int count=0;
for(int i=0;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2)
{

System.out.println("prime number");}

else{
System.out.println("not prime");
}}
}


