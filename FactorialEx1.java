import java.io.*;

class FactorialEx1		/*Using for loop*/
{
	public static void main(String args[]) throws IOException
	{
		
		String s;

		int num, fact=1;

		System.out.println("Enter number to find factorial");
		
		InputStreamReader ist = new InputStreamReader(System.in) ;

		BufferedReader br = new BufferedReader(ist) ;

      		s = br.readLine();
		
		num = Integer.parseInt(s);

		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
	}
}