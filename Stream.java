/************************************************************/
/* Author: Chris O'Brien, Eric Chen, Aidan Donohoe          */
/* Major: Computer Science                                  */
/* Creation Date: 4/19/2024 				    */
/* Due Date: 4/29/2024 					    */
/* Course: CS211-02 					    */
/* Professor Name: Prof. Shimkanon 			    */
/* Assignment: Final Project 				    */
/* Filename: Stream.java 				    */
/* Purpose: This program contains the variables for 	    */
/* the streaming of a game or other event, and a way for    */
/* the caster(s) to confirm their availability. 	    */
/************************************************************/

package application;

import java.util.Date;

public class Stream extends Event
{
	public boolean casterConfirm; //checking true/false for the acknowledgment person/people who will be casting the game
	
	public Stream(Date s, Date e, String g, String n, String d, int r, boolean c)
	{
		super(s,e,g,n,d,r);
		c = casterConfirm;
	}
}
