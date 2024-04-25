/************************************************************/
/* Author: Chris O'Brien, Eric Chen, Aidan Donohoe 	    */
/* Major: Computer Science 				    */
/* Creation Date: 4/19/2024 				    */
/* Due Date: 4/29/2024					    */
/* Course: CS211-02				  	    */
/* Professor Name: Prof. Shimkanon			    */
/* Assignment: Final Project 				    */
/* Filename: Main.java 					    */
/* Purpose: This program is for the creation of a calander  */
/* to be used for schelduling various events for the        */
/* DeSales esports club                                     */  
/************************************************************/

package application;
//importing everything to be used
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.ArrayList;
import javafx.scene.text.*;

public class Main extends Application {
	
	private Label myLabel;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try 
		{
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,1000,700);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());	
			myLabel = new Label("Click the date to schedule an event!");
			
			ArrayList<Button> buttonList = new ArrayList<Button>();

			ArrayList<VBox> vboxList = new ArrayList<VBox>();

			
			//creating the buttons that will act as the days of the month, 
			// and a way to click on them to indicate that you want to add an event to that day
			for(int i = 0; i < 40; i++)
			{
				String num;
				num = Integer.toString(i+1);
				Button myButton = new Button(num);
				myButton.setPrefWidth(350);
				myButton.setPrefHeight(100);
				myButton.setOnAction(e -> { myButton.setStyle("-fx-background-color: MediumSeaGreen");});
				buttonList.add(myButton);
			}
			
			
			for(int i = 0; i < 40; i++)
			{
				VBox vbox = new VBox(buttonList.get(i));
				vboxList.add(vbox);
			}
			
			GridPane gridpane = new GridPane();
			
			int count = 0;

			//using for loops to create the gridpanes for the days of the month
			for(int i = 0; i < 5; i++)
			{
				
				for(int j = 0; j < 7; j++)
				{
					if(count == 0)
					{
						j = 1;
					}
					
					gridpane.add(vboxList.get(count), j, i);
					count++;
					
					if (count == 31) //breaks after 30 becuase April has 30 days, in the future could expand functionality depending on month
					{
						break;
					}
				}
			}
			
			
			gridpane.setAlignment(Pos.BOTTOM_CENTER);
			
		
			//setting the name of the month as the title, and then centering and aligning it
			Text title = new Text("April");
			HBox hboxTitle = new HBox(title);
			
			title.setFont(Font.font(32));
			
			hboxTitle.setAlignment(Pos.TOP_CENTER);
			
			title.setTextAlignment(TextAlignment.JUSTIFY);
			
			
			//Days of the Week Text
			Text sunday = new Text("Sun");
			Text monday = new Text("Mon");
			Text tuesday = new Text("Tues");
			Text wednesday = new Text("Wed");
			Text thursday = new Text("Thurs");
			Text friday = new Text("Fri");
			Text saturday = new Text("Sat");
			
			GridPane gridpaneDays = new GridPane();
			//establishing the spacing for the days of the week boxes
			
			gridpaneDays.add(hboxTitle, 3, 0);
			gridpaneDays.add(sunday, 0, 1);
			gridpaneDays.add(monday, 1, 1);
			gridpaneDays.add(tuesday, 2, 1);
			gridpaneDays.add(wednesday, 3, 1);
			gridpaneDays.add(thursday, 4, 1);
			gridpaneDays.add(friday, 5, 1);
			gridpaneDays.add(saturday, 6, 1);
			
			gridpaneDays.setHgap(100);
			gridpaneDays.setVgap(60);
			gridpaneDays.setAlignment(Pos.CENTER);
			
			
			
			GridPane gridpane2 = new GridPane();
		
			
			BorderPane attempt = new BorderPane();
			
			attempt.setCenter(gridpane);
			attempt.setTop(gridpaneDays);
			
			
			Scene scene2 = new Scene(attempt, 960, 580);
			
			
			primaryStage.setScene(scene2);
			primaryStage.show();
			System.out.println(vboxList.get(0));
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	class ButtonClickHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			myLabel.setText("Thanks for clicking the button!");
		}
	}
	

}
