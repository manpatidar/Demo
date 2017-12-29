package multithreading;

 class Racer implements Runnable{
	public static String winner;
	
	public void run()
	{
		this.runner();
	}
	
	public void runner()
	{
		for(int i = 0;i<= 100; i++)
		{
			System.out.println("distance coverred by " + Thread.currentThread().getName() + " is " + i + " meter");
			
		
		boolean Racewon = this.isRacewon(i);
		if(Racewon)
		{
			break;
		}
	  }
		
    }
	private boolean isRacewon(int distance)
	{
		
	
		boolean RaceWon =  false;
		if((Racer.winner==null)&&(distance ==100))
		{
			String winnerName = Thread.currentThread().getName();
			Racer.winner = winnerName;
			RaceWon = true;
			System.out.println("winner is" + Thread.currentThread().getName());
					
		}
		else if(Racer.winner==null)
		{
			RaceWon = false;
		}
		else if(Racer.winner!= null)
		{
			RaceWon = true;
		}
			return RaceWon;
	
    }
	
}	
class ThreadDemo2{
	
	public static void main(String[] args)
	{
		
		Racer t = new Racer();
		Thread t1 = new Thread(t,"Hare");
		Thread t2 = new Thread(t,"Tortoise");
		t1.start();
		t2.start();
	}
}