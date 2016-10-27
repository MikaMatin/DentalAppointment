import java.util.Scanner;

public class Time {
	
	private int hours;
	private int minutes;
	
	public Time()
	{
		hours = 0;
		minutes = 0;
	}
	
	
	public void add(int hours, int minutes)
	{
		if(minutes >= 60)
		{
			hours += 1;
			this.minutes = this.minutes % 60;
		}
		 
		if(hours >= 23)
		{
			hours = 0;
			
		}
	}
	
	
	public Time(int hours, int minutes)
	{
		if (hours > 23)
		{
			hours = 23;
		}
		else
		{
			this.hours = hours;
		}
		if(minutes > 59)
		{
			minutes = 59;
		}
		else
		{
			this.minutes = minutes;
		}
	}
	
	
	
	public void display()
	{
		System.out.print(this.hours + ":"+ this.minutes);
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		
		Time time = new Time(hours, minutes);
		time.display();
		
		
	}
	

}
