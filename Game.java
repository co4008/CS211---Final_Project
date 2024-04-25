/************************************************************/
/* Author: Chris O'Brien, Eric Chen, Aidan Donohoe */
/* Major: Computer Science */
/* Creation Date: 4/19/2024 */
/* Due Date: 4/29/2024 */
/* Course: CS211-02 */
/* Professor Name: Prof. Shimkanon */
/* Assignment: Final Project */
/* Filename: Game.java */
/* Purpose: This program contains the variables for */
/* games held between DeSales and other teams.  */
/************************************************************/

package application;

import java.util.Date;

public class Game extends Event
{
	public String schoolName; //name of the opponent school
	
	public Game(Date s, Date e, String g, String n, String d, int r, String sn)
	{
		super(s,e,g,n,d,r);
		schoolName = sn;
	}
}
