import java.io.*;

class ReverseNumber
{
	public static void main(String args[]) throws IOException
 	{

		String sa;

		int num,r,reverse=0;

		System.out.println("Enter any number to reverse");
		
		InputStreamReader ist = new InputStreamReader(System.in) ;

		BufferedReader br = new BufferedReader(ist) ;

      		sa = br.readLine();
		
		num = Integer.parseInt(sa);

		while(num>0)      		
		{
			r = num % 10;
			reverse = reverse * 10 + r;
			num = num / 10;
		}

		System.out.println("Reversed Number is " + reverse);
		
	}
}