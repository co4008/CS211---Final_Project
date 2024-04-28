package application;

import java.util.Date;

public class Game extends Event
{
	public String schoolName;
	
	public Game(Date s, Date e, String g, String n, String d, int r, String sn)
	{
		super(s,e,g,n,d,r);
		schoolName = sn;
	}
}
