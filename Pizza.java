import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Pizza extends Application
{

	public void start(Stage primaryStage)
	{
		PizzaPane pane = new PizzaPane();
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setStyle("-fx-background-color: white");

        Scene scene = new Scene(pane, 450, 250);
        
        primaryStage.setTitle("Pizza Ordering");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}

}
