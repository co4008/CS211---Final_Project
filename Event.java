package application;

import java.util.Date;
public class Event 
{
	public Date startTime;
	public Date endTime;
	public String group;
	public String eventName;
	public String description;
	public int repeatAmount;
	
	
	
	public Event(Date s, Date e, String g, String n, String d, int r)
	{
		startTime = s;
		endTime = e;
		group = g;
		eventName = n;
		description = d;
		repeatAmount = r;
	}
	
	public Event()
	{
		startTime = null;
		endTime = null;
		group = "";
		eventName = "";
		description = "";
		repeatAmount = 0;
	}
	
	public Date getStartTime()
	{
		return startTime;
	}
	public Date getEndTime()
	{
		return endTime;
	}
	public String getGroup()
	{
		return group;
	}
	public String getEventName()
	{
		return eventName;
	}
	public String getDescription()
	{
		return description;
	}
	public int getRepeatAmount()
	{
		return repeatAmount;
	}
	
	public void setStartTime(Date s)
	{
		startTime = s;
	}
	public void setEndTime(Date e)
	{
		endTime = e;
	}
	public void setGroup(String g)
	{
		group = g;
	}
	public void setEventName(String e)
	{
		eventName = e;
	}
	public void setStartTime(String d)
	{
		description = d;
	}
	public void setRepeatAmount(int r)
	{
		repeatAmount = r;
	}
	
}
