/************************************************************/
/* Author: Aidan Donohoe, Eric Chen, Chris O'Brien */
/* Major: Computer Science */
/* Creation Date: 4/24/2024 */
/* Due Date: 4/29/2024 */
/* Course: CS211-02 */
/* Professor Name: Prof. Shimkanon */
/* Assignment: Final Project */
/* Filename: Stream.java */
/* Purpose: This program will create the stream class */
/************************************************************/
package application;
//similar to the event class, with the addition of the stream link
public class Stream extends Event
{
	public String streamLink; //provides a link to where the stream will be live, most likely on twitch.tv
	
	public Stream(String s, String e, String g, String n, String d, String r, String l)
	{
		super(s,e,g,n,d,r);
		l = streamLink;
	}
}
