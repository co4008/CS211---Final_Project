/************************************************************/
/* Author: Aidan Donohoe, Eric Chen, Chris O'Brien */
/* Major: Computer Science */
/* Creation Date: 4/24/2024 */
/* Due Date: 4/29/2024 */
/* Course: CS211-02 */
/* Professor Name: Prof. Shimkanon */
/* Assignment: Final Project */
/* Filename: Scrimmage.java */
/* Purpose: This program will create the scrimmage class */
/************************************************************/
package application;

//similar to the standard event class, but with the addition of the opponentName variable
public class Scrimmage extends Event
{
	public String opponentName; //the name of the school, club, or group the team will be scrimmming against 
	
	public Scrimmage(String s, String e, String g, String n, String d, String r, String o)
	{
		super(s,e,g,n,d,r);
		opponentName = o;
	}
	
	
}
