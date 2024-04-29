package application;

public class Stream extends Event
{
	public String streamLink;
	
	public Stream(String s, String e, String g, String n, String d, String r, String l)
	{
		super(s,e,g,n,d,r);
		l = streamLink;
	}
}
