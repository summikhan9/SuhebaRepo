package package1;

public class Const {
public Const()
{	
	this(12,13,14);
System.out.println("Default constructor");
}
public Const(int a)
{
	this(12,14,13,11);
	System.out.println("One parameterized constructor");
}
public Const(int a,int b)
{
	this(12);
	System.out.println("Two parameterized constructor");
}
public Const(int a,int b,int c)
		{
	System.out.println("Three parameterized constructor");
}
public Const(int a,int b,int c,int d)
{
	this();
System.out.println("Four parameterized constructor");
}
public static void main(String[] args) 
{
Const obj= new Const(12,13);
}
}

