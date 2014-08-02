class ThreadTest
{
	public static void main(String s[]) throws InterruptedException
	{
		Runnable r = new Runnable()
		{

			public void run()
 			{
  			try
  			{
 				Thread.sleep(1000);
 			}
  			catch(InterruptedException e)
  			{
				System.out.println("interrupted");
			}
				System.out.println("ran");
			}
		};

	Thread t = new Thread(r);
  	t.start();
	System.out.println("started");
	t.sleep(200);
	System.out.println("interrupting");
	t.interrupt();
	System.out.println("ended");
	}
}