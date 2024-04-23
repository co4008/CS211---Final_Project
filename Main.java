package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
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
			
			for(int i = 0; i < 30; i++)
			{
				String num;
				num = Integer.toString(i+1);
				Button myButton = new Button(num);
				myButton.setPrefWidth(350);
				myButton.setPrefHeight(100);
				myButton.setOnAction(e -> { myButton.setStyle("-fx-background-color: MediumSeaGreen");});
				buttonList.add(myButton);
			}
			
			
			for(int i = 0; i < 30; i++)
			{
				VBox vbox = new VBox(buttonList.get(i));
				vboxList.add(vbox);
			}
			
			GridPane gridpane = new GridPane();
			gridpane.add(vboxList.get(0), 1, 0);
			gridpane.add(vboxList.get(1), 2, 0);
			gridpane.add(vboxList.get(2), 3, 0);
			gridpane.add(vboxList.get(3), 4, 0);
			gridpane.add(vboxList.get(4), 5, 0);
			gridpane.add(vboxList.get(5), 6, 0);
			gridpane.add(vboxList.get(6), 7, 0);
			
			
			
			
			
			VBox vbox = new VBox(buttonList.get(0));
			
			Text title = new Text("April");
			
			title.setTextAlignment(TextAlignment.JUSTIFY);
			
			//gridpane.add(title, 3, 0);
			
		
			
			vbox.setAlignment(Pos.CENTER);
			
			
			
			//Image image = new Image("file:dsue.png ");
			//ImageView imageView = new ImageView(image);
			//VBox vbox = new VBox();
			
			GridPane gridpane2 = new GridPane();
			
			
					
			Scene scene2 = new Scene(gridpane, 960, 580);
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
