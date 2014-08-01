import java.io.*;

class SwapNumber
{
	public static void main(String args[]) throws IOException
 	{

		String sa, sb;

		int a,b;

		System.out.println("Enter a number");
		
		InputStreamReader ist = new InputStreamReader(System.in) ;

		BufferedReader br = new BufferedReader(ist) ;

      		sa = br.readLine();
		
		System.out.println("Enter another number");		

      		sb = br.readLine();		
		
		a = Integer.parseInt(sa);
		b = Integer.parseInt(sb);
      		
		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("Swapped numbers are " + a +" and " + b);
		
	}
}