/************************************************************/
/* Author: Aidan Donohoe, Eric Chen, Chris O'Brien */
/* Major: Computer Science */
/* Creation Date: 4/24/2024 */
/* Due Date: 4/29/2024 */
/* Course: CS211-02 */
/* Professor Name: Prof. Shimkanon */
/* Assignment: Final Project */
/* Filename: Game.java */
/* Purpose: This program will create the game class */
/************************************************************/
package application;

//Game is similar to event, with the addition of schoolName
public class Game extends Event
{
	public String schoolName; //the name of the school the esports team is playing against
	
	public Game(String s, String e, String g, String n, String d, int r, String sn)
	{
		super(s,e,g,n,d,r);
		schoolName = sn;
	}
}
