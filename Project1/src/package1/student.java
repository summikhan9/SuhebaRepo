package package1;

public class student {
	int rollno;
	int age; // Variables
public void display1() // Method1
	{
		System.out.println("Welcome all of you");
	}
public void display2() // Method2
	{
		System.out.println("Automation is very easy");
	}
public static void main(String[] args)
	{
		student st=new student();
		st.rollno= 20;
		st.age= 21;
		System.out.println("RollNo" +st.rollno);
		System.out.println("Age" +st.age);
		st.display1();
		st.display2();
	}

}



