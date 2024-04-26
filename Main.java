
package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
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
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

public class Main extends Application {
	
	private Label myLabel;
	public String testString;
	public ArrayList<Event> EventList = new ArrayList<Event>();
	
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
			
			
			GridPane gridpane2 = new GridPane();
			Text eventTitle = new Text("Select your event!");
			
			
			Text htitle;
			
			gridpane2.setVgap(30);
			gridpane2.setHgap(15);
			gridpane2.setStyle("-fx-padding: 15");
			eventTitle.setFont(Font.font(25));
			eventTitle.setTextAlignment(TextAlignment.CENTER);
			gridpane2.add(eventTitle, 0, 0);
			gridpane2.setAlignment(Pos.CENTER);
			
			Scene eventTypeScene = new Scene(gridpane2,1000,700);
			
			gridpane2.setStyle("-fx-background-color: gainsboro;");
			
			
			
			for(int i = 0; i < 40; i++)
			{
				int stringNum = i;
				String num;
				num = Integer.toString(i+1);
				Button myButton = new Button(num);
				myButton.setPrefWidth(350);
				myButton.setPrefHeight(100);
				myButton.setOnAction(e -> { primaryStage.setScene(eventTypeScene);
											
											int intnum = Integer.parseInt(num);
											if ( intnum >= 4 && intnum <= 20 || intnum >= 24)
											{
												String test = num;
												test = "You chose April " + num + "th!";
												Text stitle = new Text(test);
												stitle.setFont(Font.font(15));
												gridpane2.add(stitle, 3, 0);
											}
											
											else if( intnum == 1 || intnum == 21)
											{
												String test = num;
												test = "You chose April " + num + "st!";
												Text stitle = new Text(test);
												stitle.setFont(Font.font(15));
												gridpane2.add(stitle, 3, 0);
											}
											
											else if( intnum == 2 || intnum == 22)
											{
												String test = num;
												test = "You chose April " + num + "nd!";
												Text stitle = new Text(test);
												stitle.setFont(Font.font(15));
												gridpane2.add(stitle, 3, 0);
											}
											
											else if( intnum == 3 || intnum == 23)
											{
												String test = num;
												test = "You chose April " + num + "rd!";
												Text stitle = new Text(test);
												stitle.setFont(Font.font(15));
												gridpane2.add(stitle, 3, 0);
											}
											});
											
											
				buttonList.add(myButton);
			}
			
			
			
			
			for(int i = 0; i < 40; i++)
			{
				VBox vbox = new VBox(buttonList.get(i));
				vboxList.add(vbox);
			}
			
			GridPane gridpane = new GridPane();
			
			int count = 0;
			
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
					
					if (count == 31)
					{
						break;
					}
				}
			}
			
			
			gridpane.setAlignment(Pos.BOTTOM_CENTER);
			
		
			
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
			
			
			
			BorderPane attempt = new BorderPane();
			
			attempt.setCenter(gridpane);
			attempt.setTop(gridpaneDays);
			
			
			Scene scene2 = new Scene(attempt, 960, 580);
			
			
			primaryStage.setScene(scene2);
			primaryStage.show();
			
			//SCENE 3: Text Fields Needed
			GridPane gridpane3 = new GridPane();
			Scene dayScene = new Scene (gridpane3, 1000, 700);
			
			//Needed Text Fields for Instansiating our Event Object
			TextField startTime = new TextField();
			TextField endTime = new TextField();
			TextField group = new TextField();
			TextField eventName = new TextField();
			TextField Description = new TextField();
			TextField repeat = new TextField();
			
			Text startText = new Text("Enter the starting time:");
			Text endText = new Text("Enter the end time:");
			Text groText = new Text("Enter the groups involved:");
			Text nameText = new Text("Enter the name of your event:");
			Text descText = new Text("Enter a description of the event:");
			Text repeatText = new Text("For how many weeks will this event run? (During this same day and time):");
			
			gridpane3.add(startTime, 3,0);
			gridpane3.add(endTime, 3,1);
			gridpane3.add(group, 3,2);
			gridpane3.add(eventName, 3,3);
			gridpane3.add(Description, 3,4);
			gridpane3.add(repeat, 3, 5);
			gridpane3.add(startText, 1,0);
			gridpane3.add(endText, 1,1);
			gridpane3.add(groText, 1,2);
			gridpane3.add(nameText, 1,3);
			gridpane3.add(descText, 1,4);
			gridpane3.add(repeatText, 1, 5);
			
			
			
			Button confirmButton = new Button("Do you wish to continue?");
			gridpane3.add(confirmButton, 2, 6);
			
			gridpane3.setAlignment(Pos.CENTER);
			
			//This will create our object!
			confirmButton.setOnAction(e -> { 
			
			Rectangle rectangle = new Rectangle();
			rectangle.setX(150.0f); 
		    rectangle.setY(75.0f); 
		    rectangle.setWidth(300.0f); 
		    rectangle.setHeight(150.0f);  
		    rectangle.setFill(Color.GAINSBORO);
			gridpane2.add(rectangle, 3, 0);

			String repeatStr = repeatText.getText();
				
			Event event = new Event(startTime.getText(), endTime.getText(), group.getText(), 
					eventName.getText(), Description.getText(), repeatText.getText());
			
			EventList.add(event);
			
			primaryStage.setScene(scene2);
				
				
					
			});
			
			
			String[] eventTypeList = {"Event", "Game", "Scrimmage", "Stream"};
			
			for(int i = 0; i < 4; i++)
				{
				Button event = new Button(eventTypeList[i]);
				event.setPrefWidth(350);
				event.setPrefHeight(100);
				event.setOnAction(e -> { primaryStage.setScene(dayScene);});
				gridpane2.add(event, i, 1);
				}
			
			
			
			
			
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
