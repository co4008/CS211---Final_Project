/************************************************************/
/* Author: Aidan Donohoe, Eric Chen, Chris O'Brien */
/* Major: Computer Science */
/* Creation Date: 4/24/2024 */
/* Due Date: 4/29/2024 */
/* Course: CS211-02 */
/* Professor Name: Prof. Shimkanon */
/* Assignment: Final Project */
/* Filename: Event.java */
/* Purpose: This program will create the event class */
/************************************************************/
package application;

public class Event 
{
	public String startTime; //the time the event will begin
	public String endTime; //the time the event will end
	public String group; //what teams are involved in the event
	public String eventName; //the name of the event
	public String description; //what is going on at the event or what the reason for it is
	public String repeatAmount; //the amount of times the event will repeat, 0 is none
	
	
	
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
	
	//getting and setting all of the variables
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
	
	public String toString()
	{
		return eventName;
	}
}
