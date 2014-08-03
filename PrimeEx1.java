import java.io.*;

class PrimeEx1
{
	public static void main(String args[]) throws IOException
 	{

		String s;

		int num,r=0;

		System.out.println("Enter any number");
		
		InputStreamReader ir = new InputStreamReader(System.in) ;

		BufferedReader br = new BufferedReader(ir) ;

      		s = br.readLine();
		
		num = Integer.parseInt(s);

		for(int i=2; i<=num-1; i++)
		{
			if(num%i==0)
			{
				r=1;
				break;
			}
		}

		if(r==0)
		{
			System.out.println("It's a Prime Number ");	
		}
		else
		{
			System.out.println("It's not a Prime Number");
		}
	
	}
}