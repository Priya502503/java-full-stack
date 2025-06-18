import java.util.Scanner;
 class Example
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter number of elements"+"n");
int n=sc.nextInt();
int a[] =new int[n];
int sum=0;
System.out.println("enter"+n+"numbers:");

for(i=0;i<n;i++)
{
sum=sum+a[i];
}
System.out.println("sum of array:"+sum);
}
}

