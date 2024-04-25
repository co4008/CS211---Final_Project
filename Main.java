package application;
	
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
			
			
			GridPane gridpane2 = new GridPane();
			Scene eventTypeScene = new Scene(gridpane2,1000,700);
			
			
			for(int i = 0; i < 40; i++)
			{
				String num;
				num = Integer.toString(i+1);
				Button myButton = new Button(num);
				myButton.setPrefWidth(350);
				myButton.setPrefHeight(100);
				myButton.setOnAction(e -> { primaryStage.setScene(eventTypeScene);});
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
			
			GridPane gridpane3 = new GridPane();
			Scene dayScene = new Scene (gridpane3, 1000, 700);
			
			
			String[] eventTypeList = {"Event", "Game", "Scrimmage", "Stream"};
			
			for(int i = 0; i < 4; i++)
				{
				Button event = new Button(eventTypeList[i]);
				event.setPrefWidth(350);
				event.setPrefHeight(100);
				event.setOnAction(e -> { primaryStage.setScene(dayScene);});
				gridpane2.add(event, i, 0);
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
