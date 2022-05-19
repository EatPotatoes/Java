import java.io.File;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SoundEffects extends Application
{
	private Image[] pictures = new Image[4];
	private ImageView background;
	private AudioClip[] sounds;
	private AudioClip song;
	private Group root;
	private int count = 0;
	
	public void start(Stage primaryStage)
	{
		pictures[0] = new Image("red.png");
		pictures[1] = new Image("blue.png");
		pictures[2] = new Image("yellow.png");
		pictures[3] = new Image("white.png");
		
		File[] audio = {new	File("bell.mp3"), 
				new File("music.mp3"), new File("horn.mp3"), 
				new File("phone.mp3"), new File("whistle.mp3")}; 	
		sounds = new AudioClip[audio.length];
		
		for (int i = 0; i < audio.length; i++)
            sounds[i] = new AudioClip(audio[i].toURI().toString());
		song = sounds[0];
		song.play();
		
		background = new ImageView(pictures[0]);
		
		root = new Group(background);
		
		Scene scene = new Scene(root, 400, 300, Color.BLACK);
		
		scene.setOnMouseClicked(this::processMouseClick);
        
        primaryStage.setTitle("Sound Effects");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public void processMouseClick(MouseEvent event)
	{
		song.stop();
		
		root.getChildren().clear();
		count++;
		background = new ImageView(pictures[count % 4]);
		root.getChildren().add(background);
		
		song = sounds[count % 5];
		song.play();
	}
	
	public static void main(String[] args)
    {
        launch(args);
    }
}
