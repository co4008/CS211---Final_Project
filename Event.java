/************************************************************/
/* Author: Chris O'Brien, Eric Chen, Aidan Donohoe */
/* Major: Computer Science */
/* Creation Date: 4/19/2024 */
/* Due Date: 4/29/2024 */
/* Course: CS211-02 */
/* Professor Name: Prof. Shimkanon */
/* Assignment: Final Project */
/* Filename: Event.java */
/* Purpose: This program contains the variables for */
/* any type of general meeting or event that would be held.  */
/************************************************************/

package application;

import java.util.Date;
public class Event 
{
	public Date startTime; //the time the event is going to start
	public Date endTime; //the time the event is going to end
	public String group; //Who should be notified about this event
	public String eventName; //What the name of the event is
	public String description; //A description about what will be at the event
	public int repeatAmount; //The amount of times this will repeat weekly. 0 = no repeat
	
	
	
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
