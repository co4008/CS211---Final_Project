/************************************************************/
/* Author: Chris O'Brien, Eric Chen, Aidan Donohoe */
/* Major: Computer Science */
/* Creation Date: 4/19/2024 */
/* Due Date: 4/29/2024 */
/* Course: CS211-02 */
/* Professor Name: Prof. Shimkanon */
/* Assignment: Final Project */
/* Filename: Scrimmage.java */
/* Purpose: This program contains the variables for */
/* any scrimmage, a practice played against another team  */
/************************************************************/

package application;

import java.util.Date;

public class Scrimmage extends Event
{
	public String opponentName; //name of the opponents or team we will be practicing against
	
	public Scrimmage(Date s, Date e, String g, String n, String d, int r, String o)
	{
		super(s,e,g,n,d,r);
		opponentName = o;
	}
}
