
package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import java.util.ArrayList;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.shape.Rectangle;

public class Main extends Application {
	
	public ArrayList<Event> eventList = new ArrayList<Event>();
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try 
		{
			// root scene
			primaryStage.setTitle("Esports Scheduling Program");
			BorderPane root = new BorderPane();
			Scene calendarScene = new Scene(root);
			calendarScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());	
			Label directions = new Label("Click the date to schedule an event!");
			
			ArrayList<Button> buttonList = new ArrayList<Button>();
			ArrayList<VBox> vboxList = new ArrayList<VBox>();
			
			
			GridPane eventTypes = new GridPane();
			Text eventTitle = new Text("Select your event!");
			
			
			eventTypes.setVgap(30);
			eventTypes.setHgap(15);
			eventTypes.setStyle("-fx-padding: 15");
			eventTitle.setFont(Font.font(25));
			eventTitle.setTextAlignment(TextAlignment.CENTER);
			eventTypes.add(eventTitle, 0, 0);
			eventTypes.setAlignment(Pos.CENTER);
			
			Scene eventTypeScene = new Scene(eventTypes,1000,700);
			
			eventTypes.setStyle("-fx-background-color: gainsboro;");
			
			
			
			
			for(int i = 0; i < 40; i++)
			{
				String num;
				num = Integer.toString(i+1);
				Button dateButton = new Button(num);
				dateButton.setPrefWidth(150);
				dateButton.setPrefHeight(100);
				dateButton.setOnAction(e -> {primaryStage.setScene(eventTypeScene);
							     int intnum = Integer.parseInt(num);
							     if ( intnum >= 4 && intnum <= 20 || intnum >= 24)
							     {
								     String date = num;
								     date = "You chose April " + num + "th!";
								     Text stitle = new Text(date);
								     stitle.setFont(Font.font(15));
								     eventTypes.add(stitle, 3, 0);
							     }
											
							     else if( intnum == 1 || intnum == 21)
							     {
								     String date = num;
								     date = "You chose April " + num + "st!";
								     Text stitle = new Text(date);
								     stitle.setFont(Font.font(15));
								     eventTypes.add(stitle, 3, 0);
							     }			
							     else if( intnum == 2 || intnum == 22)
							     {
								     String date = num;
								     date = "You chose April " + num + "nd!";
								     Text stitle = new Text(date);
								     stitle.setFont(Font.font(15));
								     eventTypes.add(stitle, 3, 0);
							     }
							     else if( intnum == 3 || intnum == 23)
							     {
								     String date = num;
								     date = "You chose April " + num + "rd!";
								     Text stitle = new Text(date);
								     stitle.setFont(Font.font(15));
								     eventTypes.add(stitle, 3, 0);
							     }
							     if (dateButton.getStyle().equals("-fx-background-color: green;"))
							     {				
								     Button backButton = new Button("Go Back?");
								     backButton.setPrefWidth(100);
								     backButton.setPrefHeight(50);
								     BorderPane showPane = new BorderPane();
								     Scene scheduledScene = new Scene(showPane, 1000, 700);
								     Text showText = new Text("You already have an event planned on this date");
								     showPane.setCenter(showText);
								     showPane.setBottom(backButton);
								     showPane.setStyle("-fx-padding: 20");
								     backButton.setOnAction(a -> {Rectangle rectangle = new Rectangle();
												  rectangle.setX(150.0f); 
												  rectangle.setY(75.0f); 
												  rectangle.setWidth(300.0f); 
											    	  rectangle.setHeight(150.0f);  
											    	  rectangle.setFill(Color.GAINSBORO);
												  eventTypes.add(rectangle, 3, 0);
												  
												  primaryStage.setScene(calendarScene);
												 }
											   );
								     showText.setFont(Font.font(32));
								     backButton.setAlignment(Pos.CENTER);
								     primaryStage.setScene(scheduledScene);
							     }
							     dateButton.setStyle("-fx-background-color: green;");
							    });
				buttonList.add(dateButton);
			}
			
			for(int i = 0; i < 40; i++)
			{
				VBox vbox = new VBox(buttonList.get(i));
				vboxList.add(vbox);
			}
			
			GridPane calendar = new GridPane();
			
			int count = 0;
			
			for(int i = 0; i < 5; i++)
			{
				
				for(int j = 0; j < 7; j++)
				{
					if(count == 0)
					{
						j = 1;
					}
					
					calendar.add(vboxList.get(count), j, i);
					count++;
					
					if (count == 31)
					{
						break;
					}
				}
			}
			
			Text title = new Text("April");
			title.setFont(Font.font(32));
			
			VBox vboxTitle = new VBox(title, directions);
			vboxTitle.setAlignment(Pos.TOP_CENTER);
			
			//Days of the Week Text
			Text sunday = new Text("Sun");
			Text monday = new Text("Mon");
			Text tuesday = new Text("Tues");
			Text wednesday = new Text("Wed");
			Text thursday = new Text("Thurs");
			Text friday = new Text("Fri");
			Text saturday = new Text("Sat");
			
			GridPane gridpaneDays = new GridPane();
			
			gridpaneDays.add(sunday, 0, 1);
			gridpaneDays.add(monday, 1, 1);
			gridpaneDays.add(tuesday, 2, 1);
			gridpaneDays.add(wednesday, 3, 1);
			gridpaneDays.add(thursday, 4, 1);
			gridpaneDays.add(friday, 5, 1);
			gridpaneDays.add(saturday, 6, 1);
			
			gridpaneDays.setHgap(125);
			gridpaneDays.setVgap(25);
			gridpaneDays.setAlignment(Pos.CENTER);
			
			root.setTop(vboxTitle);
			root.setCenter(gridpaneDays);
			root.setBottom(calendar);
			root.setStyle("-fx-background-color: gainsboro;");
			
			primaryStage.setScene(calendarScene);
			primaryStage.show();
			
			//SCENE 3: Text Fields Needed
			GridPane eventInfo = new GridPane();
			Scene eventInfoScene = new Scene (eventInfo, 1000, 700);
			eventInfo.setStyle("-fx-background-color: gainsboro;");
			eventInfo.setVgap(10);
			eventInfo.setAlignment(Pos.CENTER);
			
			//Needed Text Fields for Instantiating our Event Object
			TextField startTime = new TextField();
			TextField endTime = new TextField();
			TextField group = new TextField();
			TextField eventName = new TextField();
			TextArea description = new TextArea();
			description.setPrefSize(350, 80);
			TextField repeat = new TextField();
			
			Button confirmButton = new Button("Do you wish to continue?");
			
			Text startText = new Text("Enter the starting time:");
			Text endText = new Text("Enter the end time:");
			Text groText = new Text("Enter the groups involved:");
			Text nameText = new Text("Enter the name of your event:");
			Text descText = new Text("Enter a description of the event:");
			Text repeatText = new Text("For how many weeks will this event run? (During this same day and time):");
			
			//This will create our object!
			confirmButton.setOnAction(e -> {
				Rectangle rectangle = new Rectangle();
				rectangle.setX(150.0f); 
			    rectangle.setY(75.0f); 
			    rectangle.setWidth(300.0f); 
			    rectangle.setHeight(150.0f);  
			    rectangle.setFill(Color.GAINSBORO);
				eventTypes.add(rectangle, 3, 0);
				
				
				eventInfo.getChildren().clear();
				
				
				Event event = new Event(startTime.getText(), endTime.getText(), group.getText(), eventName.getText(), description.getText(), repeat.getText());
				
				eventList.add(event);
				startTime.setText("");
				endTime.setText("");
				group.setText("");
				eventName.setText("");
				description.setText("");
				repeat.setText("");
				
				primaryStage.setScene(calendarScene);
											});
			
			
			String[] eventTypeList = {"Event", "Game", "Scrimmage", "Stream"};
			
			for(int i = 0; i < 4; i++)
				{
				Button event = new Button(eventTypeList[i]);
				event.setPrefWidth(350);
				event.setPrefHeight(100);
				eventTypes.add(event, i, 1);
				event.setOnAction(e -> {
					
					eventInfo.add(startText, 1,0);
					eventInfo.add(endText, 1,1);
					eventInfo.add(groText, 1,2);
					eventInfo.add(nameText, 1,3);
					eventInfo.add(descText, 1,4);
					eventInfo.add(repeatText, 1, 5);
					
					eventInfo.add(startTime, 3,0);
					eventInfo.add(endTime, 3,1);
					eventInfo.add(group, 3,2);
					eventInfo.add(eventName, 3,3);
					eventInfo.add(description, 3,4);
					eventInfo.add(repeat, 3, 5);
					
					eventInfo.add(confirmButton, 2, 7);
					
					if (event.getText().equals("Game"))
					{
						Text schoolNameText = new Text("Enter the name of the opposing school:");						
						TextField schoolName = new TextField();
						eventInfo.add(schoolNameText, 1, 6);
						eventInfo.add(schoolName, 3, 6);
					}
					else if (event.getText().equals("Scrimmage"))
					{
						Text opponentNameText = new Text("Enter the name of the scrimmage opponents:");						
						TextField opponentName = new TextField();
						eventInfo.add(opponentNameText, 1, 6);
						eventInfo.add(opponentName, 3, 6);
					}
					else if (event.getText().equals("Stream"))
					{
						Text streamLinkText = new Text("Enter the stream link:");						
						TextField streamLink = new TextField();
						eventInfo.add(streamLinkText, 1, 6);
						eventInfo.add(streamLink, 3, 6);
					}
					primaryStage.setScene(eventInfoScene);

										});
				}
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
