package application;

public class Event 
{
	public String startTime;
	public String endTime;
	public String group;
	public String eventName;
	public String description;
	public String repeatAmount;
	
	
	
	public Event(String s, String e, String g, String n, String d, String r)
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
		repeatAmount = "";
	}
	
	public String getStartTime()
	{
		return startTime;
	}
	public String getEndTime()
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
	public String getRepeatAmount()
	{
		return repeatAmount;
	}
	
	public void setStartTime(String s)
	{
		startTime = s;
	}
	public void setEndTime(String e)
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
	public void setDescription(String d)
	{
		description = d;
	}
	public void setRepeatAmount(String r)
	{
		repeatAmount = r;
	}
	
}
