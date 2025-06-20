class A
{
static int a=10;
static int b=20;
int c=30;
int d=10;
static
{
System.out.println("static");
}
{
System.out.println("instance");
System.out.println(a);
}
static{
int a=20;
System.out.println(a+b);
}
static void add()
{
System.out.println(a+b);
}

static void sub()
{
System.out.println(a-b);
}
void mul()
{
System.out.println(c*d);
}
void div()
{
System.out.println(c/d);
}
}
class B
{
static int a=20;
static int b=30;
int c=60;
int d=40;
static{
System.out.println("static block");
}
static {
int b=40;
System.out.println(a+b);
}
static void add()
{
System.out.println(a+b);
}
static void sub()
{
System.out.println(a-b);
}
void mul()
{
System.out.println(c*d);
}
void div()
{
System.out.println(c/d);
}
public static void main (String[] args)
{
B b=new B();
add();
sub();
b.mul();
b.div();

A a=new A();
a.add();
a.sub();
a.mul();
a.div();
}
}



































