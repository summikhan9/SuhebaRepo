package package1;

public class ArithmeticOp1 {
	public int sum(int a, int b)
	{
		int c;
		c =a+b;
		System.out.println("Result of sum is " +c);
		return c;
	}
	public int sub(int a ,int b)
	{
	int c;
    c=a-b;
	System.out.println("Result of sub is "+c);
	return c;
	}
	public int multi(int a, int b)
	{
		int c;
		c =a*b;
		System.out.println("Result of multi is " +c);
		return c;
	}
		public void div(int a, int b)
		{
			int c;
			c =a/b;
			System.out.println("Division of two no. is " +c);
		}

		public static void main(String[] args)
		{
			ArithmeticOp1 obj = new ArithmeticOp1();
			int sum1 = obj.sum(10, 2);
			int sum2 = obj.sum(sum1, 2);
			int sub = obj.sub(sum2, 2);
			int mul = obj.multi(sub, 2);
			obj.div(mul,2);
		}
}
			
			
		
