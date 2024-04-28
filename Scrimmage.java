package application;

import java.util.Date;

public class Scrimmage extends Event
{
	public String opponentName;
	
	public Scrimmage(Date s, Date e, String g, String n, String d, int r, String o)
	{
		super(s,e,g,n,d,r);
		opponentName = o;
	}
	
	
}
