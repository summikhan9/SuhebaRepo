package package1;

public class ArithmeticOp2 {
	public int multi(int a, int b)
	{
		int c;
		c =a*b;
		System.out.println("Result of multi is " +c);
		return c;
	}
	public int sum(int c, int b)
	{
		int c1;
		c1 =c+b;
		System.out.println("Result of sum is " +c1);
		return c1;
	}
	
	public int sub(int c1 , int b)
	{
	int c2;
    c2= c1-b;
	System.out.println("Result of sub is "+c2);
	return c2;
	}
	public void div(int a, int b)
		{
			int c;
			c =a/b;
			System.out.println("Division of two no. is " +c);
		}

		public static void main(String[] args)
		{
			ArithmeticOp2 obj = new ArithmeticOp2();
			int mul = obj.multi(10, 2);
			int sum = obj.sum(mul,2);
			int sub = obj.sub(sum,2);
int mul1 = obj.multi(sub,2);
			obj.div(mul1,2);
		}
	}
