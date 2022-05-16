import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
/**
 * 
 * @author 23azhang
 * Program to simulate a spaceship that follows the mouse and shoots a continuous laser when clicked
 */
public class Spaceship extends Application
{
	/**
	 * initialize instance data
	 */
	private ImageView image;
	private Line line;
	private Group root;
	
	/**
	 * Creates the spaceship image and waits for mouse movement/click
	 */
	public void start(Stage primaryStage)
	{
		Image ship = new Image("spaceship.png");
        
        image = new ImageView(ship);
        image.setX(20);
        image.setY(20);
        image.autosize();
        
        root = new Group();
        
        Scene scene = new Scene(root, 1375, 700, Color.WHITE);
        
        scene.setOnMouseMoved(this::processMouseMoved);
        scene.setOnMousePressed(this::processMousePress);
        scene.setOnMouseDragged(this::processMouseDrag);
        scene.setOnMouseReleased(this::processMouseReleased);

        root.getChildren().add(image);
        
        primaryStage.setTitle("Spaceship");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	/**
	 * sets the spaceship's position to where the mouse is
	 * @param event when the mouse is moved
	 */
	public void processMouseMoved(MouseEvent event)
	{
		image.setY(event.getY() - 100);
		image.setX(event.getX() - 100);
	}
	
	/**
	 * creates a laser from the tip of the ship to the top of the screen
	 * @param event when the mouse is pressed
	 */
	public void processMousePress(MouseEvent event)
    {
        line = new Line(event.getX() + 4, event.getY() - 85, event.getX() + 4, 0);
        line.setStroke(Color.DARKBLUE);
        line.setStrokeWidth(8);
        root.getChildren().add(line);
        
        image.setY(event.getY() - 100);
		image.setX(event.getX() - 100);
    }
	
	/**
	 * has the laser follow the spaceship's position even while moving
	 * @param event when the mouse is dragged
	 */
	public void processMouseDrag(MouseEvent event)
    {
		image.setY(event.getY() - 100);
		image.setX(event.getX() - 100);
		
		line.setStartY(event.getY() - 85);
		line.setStartX(event.getX() + 4);
		line.setEndX(event.getX() + 4);
        line.setEndY(0);
    }
	
	/**
	 * removes the laser when the mouse is released
	 * @param event when the mouse is released
	 */
	public void processMouseReleased(MouseEvent event)
	{
		line.setVisible(false);
	}
	
	/**
	 * initiates the program
	 * @param args
	 */
	public static void main(String[] args)
    {
        launch(args);
    }
}
