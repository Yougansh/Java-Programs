import java.io.*;

class FactorialEx3 	/*Using Recursion*/
{
	public static void main(String args[]) throws IOException
	{
		
		String s;

		int num, print;

		System.out.println("Enter number to find factorial");
		
		InputStreamReader ist = new InputStreamReader(System.in) ;

		BufferedReader br = new BufferedReader(ist) ;

      		s = br.readLine();
		
		num = Integer.parseInt(s);

		FactorialEx3 obj = new FactorialEx3();

		print = obj.func(num);
		
		System.out.println(print);
	}

	int func(int a)
	{
		int x=1;
		if(a==1)
		{
			return 1;
		}
		else
		{
			x = a * func(a-1);
		}
	return x;
	}

}