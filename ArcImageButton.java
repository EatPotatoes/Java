import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ArcImageButton extends Application
{
	@Override
	public void start(Stage primaryStage) 
	{
		Image img1 = new Image("dog.jpg");
		ImageView imgView1 = new ImageView(img1);
		Image img2 = new Image("cat.jpg");
		ImageView imgView2 = new ImageView(img2);
		Image img3 = new Image("frog.jpg");
		ImageView imgView3 = new ImageView(img3);
		
		Button push1 = new Button("Image 1 Crop");
		push1.setOnAction((event) -> {
			imgView1.setViewport(new Rectangle2D(80, 20, 200, 80));
		});
		
		Button push2 = new Button("Image 2 Crop");
		push2.setOnAction((event) -> {
			imgView2.setViewport(new Rectangle2D(60, 60, 275, 80));
		});
		
		Button push3 = new Button("Image 3 Crop");
		push3.setOnAction((event) -> {
			imgView3.setViewport(new Rectangle2D(75, 40, 200, 80));
		});
		
		FlowPane pane = new FlowPane(imgView1, imgView2, imgView3, push1, push2, push3);
		pane.setAlignment(Pos.CENTER);
		pane.setColumnHalignment(HPos.CENTER);
		pane.setRowValignment(VPos.CENTER);
		pane.setVgap(90);
		pane.setHgap(50);
		pane.setStyle("-fx-background-color: cyan");
		
		Scene scene = new Scene(pane, 900, 350);
		
		primaryStage.setTitle("Arc Image Button");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
