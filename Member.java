package application;
import java.util.ArrayList;

public class Member 
{ 
	public String memberName;
	public ArrayList<String> group; 
	public boolean captainConfirm; 
	
	public Member(String m, ArrayList<String> g, boolean c)
	{
		memberName = m;
		group = g;
		captainConfirm = c;
	}
	
	//Getters
	public String getMemberName()
	{
		return memberName;
	}
	public ArrayList<String> getGroup()
	{
		return group;
	}
	public boolean getCaptainConfirm()
	{
		return captainConfirm;
	}
	
	//Setters
	public void setMemberName(String m)
	{
		memberName = m;
	}
	public void setGroup(ArrayList<String> g)
	{
		group = g;
	}
	public void setCaptainConfirm(boolean c)
	{
		captainConfirm = c;
	}
	
	public String toString()
	{
		return memberName + ' ' + group;
	}
	
	
	
}

