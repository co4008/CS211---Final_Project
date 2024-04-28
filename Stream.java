package application;

import java.util.Date;

public class Stream extends Event
{
	public boolean casterConfirm;
	
	public Stream(Date s, Date e, String g, String n, String d, int r, boolean c)
	{
		super(s,e,g,n,d,r);
		c = casterConfirm;
	}
}
