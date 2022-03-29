//Albert Zhang Pokemon Project 2/1/22
//Draws a Pokemon(Marill) using JavaFX


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Pokemon extends Application
{
	public void start(Stage primaryStage)
	{
		Ellipse body = new Ellipse(250, 250, 125, 140);
		body.setFill(Color.CORNFLOWERBLUE);
		body.setTranslateX(-80);
		body.setStroke(Color.BLACK);
		
		Ellipse stomach = new Ellipse(250, 308, 105, 81);
		stomach.setFill(Color.WHITE);
		stomach.setTranslateX(-80);
		stomach.setStroke(Color.BLACK);
		
		Circle rightEye = new Circle(210, 180, 12);
		Circle rightPupil = new Circle(211, 175, 3);
		rightPupil.setFill(Color.WHITE);
		
		Circle leftEye = new Circle(135, 180, 12);
		Circle leftPupil = new Circle(136, 175, 3);
        leftPupil.setFill(Color.WHITE);
        
        Polygon nose = new Polygon();
        nose.getPoints().addAll(new Double[]
        		{
        			165.0, 190.0,
        			180.0, 190.0,
        			172.5, 194.0
        		});
        
        Line mouth1 = new Line(152, 200, 153, 202);
        Line mouth2 = new Line(153, 202, 191, 202);
        Line mouth3 = new Line(191, 202, 192, 200);
        
        Ellipse leftFoot = new Ellipse(90, 375, 12, 22);
        leftFoot.setFill(Color.CORNFLOWERBLUE);
        leftFoot.setRotate(50);
        
        Ellipse leftFootOutline = new Ellipse(90, 375, 13, 23);
        leftFootOutline.setFill(Color.BLACK);
        leftFootOutline.setRotate(50);
        
        Ellipse rightFoot = new Ellipse(250, 375, 12, 22);
        rightFoot.setFill(Color.CORNFLOWERBLUE);
        rightFoot.setRotate(-50);
        
        Ellipse rightFootOutline = new Ellipse(250, 375, 13, 23);
        rightFootOutline.setFill(Color.BLACK);
        rightFootOutline.setRotate(-50);
        
        Ellipse leftEar = new Ellipse(85, 120, 35, 45);
        leftEar.setFill(Color.CORNFLOWERBLUE);
        leftEar.setStroke(Color.BLACK);
        leftEar.setRotate(35);
        
        Ellipse rightEar = new Ellipse(255, 120, 35, 45);
        rightEar.setFill(Color.CORNFLOWERBLUE);
        rightEar.setStroke(Color.BLACK);
        rightEar.setRotate(-35);
        
        Ellipse leftEarInner = new Ellipse(80, 125, 25, 35);
        leftEarInner.setFill(Color.RED);
        leftEarInner.setRotate(30);
        
        Ellipse rightEarInner = new Ellipse(260, 125, 25, 35);
        rightEarInner.setFill(Color.RED);
        rightEarInner.setRotate(-30);
        
        Ellipse rightArm = new Ellipse(290, 265, 10, 30);
        rightArm.setFill(Color.CORNFLOWERBLUE);
        rightArm.setRotate(-45);
        
        Arc rightArmOutline = new Arc(295, 262, 10, 30, 30, -240);
        rightArmOutline.setType(ArcType.OPEN);
        rightArmOutline.setStroke(Color.BLACK);
        rightArmOutline.setFill(null);
        rightArmOutline.setRotate(-45);
        
        Ellipse leftArm = new Ellipse(50, 265, 10, 30);
        leftArm.setFill(Color.CORNFLOWERBLUE);
        leftArm.setRotate(45);
        
        Arc leftArmOutline = new Arc(45, 262, 10, 30, 30, -240);
        leftArmOutline.setType(ArcType.OPEN);
        leftArmOutline.setStroke(Color.BLACK);
        leftArmOutline.setFill(null);
        leftArmOutline.setRotate(45);
        
        Line tail1 = new Line(270, 335, 315, 312);
        tail1.setStrokeWidth(6);
        
        Line tail2 = new Line(315, 312, 320, 330);
        tail2.setStrokeWidth(6);
        
        Line tail3 = new Line(320, 330, 350, 310);
        tail3.setStrokeWidth(6);
        
        Line tail4 = new Line(350, 310, 354, 325);
        tail4.setStrokeWidth(6);
        
        Line tail5 = new Line(354, 325, 368, 311);
        tail5.setStrokeWidth(5);
        
        Line tail6 = new Line(368, 311, 372, 319);
        tail6.setStrokeWidth(5);
        
        Line tail7 = new Line(372, 319, 379, 311);
        tail7.setStrokeWidth(5);
        
        Line tail8 = new Line(379, 311, 384, 315);
        tail8.setStrokeWidth(5);
        
        Line tail9 = new Line(384, 315, 392, 300);
        tail9.setStrokeWidth(4);
        
        Circle tailBall = new Circle(400, 250, 50);
        tailBall.setStroke(Color.BLACK);
        tailBall.setFill(Color.CORNFLOWERBLUE);
        
        Group arms = new Group(rightArm, rightArmOutline, leftArm, leftArmOutline);
		Group tail = new Group(tail1, tail2, tail3, tail4, tail5, tail6, tail7, tail8, tail9, tailBall);
        Group ears = new Group (leftEar, rightEar, leftEarInner, rightEarInner);
		Group feet = new Group(leftFootOutline, leftFoot, rightFootOutline, rightFoot);
        Group face = new Group(rightEye, rightPupil, leftEye, leftPupil, nose, mouth1, mouth2, mouth3);
        Group root = new Group(feet, ears, tail, body, stomach, arms, face); 
		Scene scene = new Scene(root, 500, 500);
		
		primaryStage.setTitle("Marill");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}

}
