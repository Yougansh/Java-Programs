import java.io.*;

class FactorialEx2 	/*Using While loop*/
{
	public static void main(String args[]) throws IOException
	{
		
		String s;

		int num,i=1,fact=1;

		System.out.println("Enter number to find factorial");
		
		InputStreamReader ist = new InputStreamReader(System.in) ;

		BufferedReader br = new BufferedReader(ist) ;

      		s = br.readLine();
		
		num = Integer.parseInt(s);

		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		
		System.out.println(fact);
	}
}