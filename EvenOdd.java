import java.io.*;

class EvenOdd
{
	public static void main(String args[]) throws IOException
 	{
		String s;
		int n;

		System.out.println("Enter a number");
		
		InputStreamReader istream = new InputStreamReader(System.in) ;

		BufferedReader br = new BufferedReader(istream) ;

      		s = br.readLine();
		
		n = Integer.parseInt(s);
      		
		if(n%2==0)
		{
			System.out.println("No. is Even");
		}
		else
		{
			System.out.println("No. is Odd");		
		}
	}
}