package package1;

public class Arithmetic {
	public int sum(int a, int b)
	{
		int c;
		c =a+b;
		System.out.println("Result of sum is " +c);
		return c;
	}
	public int sub(int x ,int y)
	{
	int z;
    z=x-y;
	System.out.println("Result of sub is "+z);
	return z;
	}
	public void multi(int x1, int x2)
	{
		int result;
		result = x1*x2;
		System.out.println("The final result is "+result);
	}
	public static void main(String[] args) {
		Arithmetic obj = new Arithmetic();
		int sumResult =obj.sum(10, 2);
		int subResult =obj.sub(10, 2);
		obj.multi(sumResult, subResult);
		
	}
}
	
	


