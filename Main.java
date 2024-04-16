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
			myLabel = new Label("Hello World");
			Button myButton = new Button("Click Me");
			myButton.setOnAction(e -> { myLabel.setText("Thanks for clicking me");});
			VBox vbox2 = new VBox(10, myLabel, myButton);
			vbox2.setAlignment(Pos.CENTER);
			
			
			Image image = new Image("file:dsue.png ");
			ImageView imageView = new ImageView(image);
			VBox vbox = new VBox(imageView);
			
			GridPane gridpane = new GridPane();
			gridpane.add(myLabel, 0, 0);
			gridpane.add(vbox, 0, 1);
			gridpane.add(vbox2, 1, 0);
					
			Scene scene2 = new Scene(gridpane, 960, 580);
			primaryStage.setScene(scene2);
			primaryStage.show();
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	class ButtonClickHandler implements eventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			myLabel.setText("Thanks for clicking the button!!");
		}
	}
	

}
