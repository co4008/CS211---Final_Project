package application;
import java.util.ArrayList;

public class Month 
{
	public String monthName;
	public ArrayList<String> eventList;
	
	public Month(String m, ArrayList<String> e)
	{
		monthName = m; 
		eventList = e;
	}
	
	//Getters
	public String getmonthName()
	{
		return monthName;
	}
	public ArrayList<String> getEventList() 
	{
		return eventList;
	}
	
	//Setters
	public void setMonthName(String m)
	{
		monthName = m;
	}
	public void setEventList(ArrayList<String> e)
	{
		eventList = e;
	}
}
