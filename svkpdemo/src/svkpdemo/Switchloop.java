package svkpdemo;

public class Switchloop {

	public static void main(String[] args) {
		char x ='F';
		switch(x)
		{
		case'a':
		case'A':
			System.out.println("the value of x is a");
			break;
		case'b':
		case'B':
			System.out.println("the value of x is b");
			break;
		case'c':
		case'C':
			System.out.println("the value of x is c");
			break;
		default:
			System.out.println("the value of x is other than a,b,c");
			break;
			
		}

	}

}
