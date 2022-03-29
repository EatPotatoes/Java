import java.text.DecimalFormat;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
/**
 * 
 * @author 23azhang
 *
 */
public class PizzaPane extends HBox
{
	private double cost;
	private Text money, toppingTitle, colorTitle;
	private CheckBox pepperoniBox, sausageBox, onionBox, moreCheeseBox, moreMoreCheeseBox, moreBreadBox;
	private RadioButton blueButton, redButton, greenButton, yellowButton, purpleButton, orangeButton;
	private DecimalFormat df = new DecimalFormat("#.00");
	
	/**
	 * Initiates the instance data of the Pizza Ordering Program
	 * 	Creates the checkbox objects with correct names
	 * 	Creates the background color objects with correct names
	 * 	Creates and formats the price as text to be displayed
	 * 
	 * Creates VBoxes to format the program
	 */
	public PizzaPane()
	{		
		pepperoniBox = new CheckBox("Pepperoni");
		pepperoniBox.setOnAction(this::processCheckBoxAction);
		sausageBox = new CheckBox("Sausage");
		sausageBox.setOnAction(this::processCheckBoxAction);
		onionBox = new CheckBox("Onions");
		onionBox.setOnAction(this::processCheckBoxAction);
		moreCheeseBox = new CheckBox("More Cheese");
		moreCheeseBox.setOnAction(this::processCheckBoxAction);
		moreMoreCheeseBox = new CheckBox("More More Cheese");
		moreMoreCheeseBox.setOnAction(this::processCheckBoxAction);
		moreBreadBox = new CheckBox("More Bread");
		moreBreadBox.setOnAction(this::processCheckBoxAction);
		
		ToggleGroup group = new ToggleGroup();
		blueButton = new RadioButton("Blue");
        blueButton.setToggleGroup(group);
        blueButton.setOnAction(this::processRadioButtonAction);
        
        redButton = new RadioButton("Red");
        redButton.setToggleGroup(group);
        redButton.setOnAction(this::processRadioButtonAction);
        
        greenButton = new RadioButton("Green");
        greenButton.setToggleGroup(group);
        greenButton.setOnAction(this::processRadioButtonAction);
        
        yellowButton = new RadioButton("Yellow");
        yellowButton.setToggleGroup(group);
        yellowButton.setOnAction(this::processRadioButtonAction);
        
        purpleButton = new RadioButton("Purple");
        purpleButton.setToggleGroup(group);
        purpleButton.setOnAction(this::processRadioButtonAction);
        
        orangeButton = new RadioButton("Orange");
        orangeButton.setToggleGroup(group);
        orangeButton.setOnAction(this::processRadioButtonAction);
		
        Font font1 = new Font("Courier", 24);
        
        cost = 12.00;
        money = new Text("Cost: $" + df.format(cost));
        money.setFont(font1);
        money.setUnderline(true);
        toppingTitle = new Text("Choose Toppings:");
        colorTitle = new Text("Choose Background Color:");
        
        VBox price = new VBox(money);
        price.setAlignment(Pos.CENTER);
        		
        VBox toppings = new VBox(toppingTitle, pepperoniBox, sausageBox, onionBox, moreCheeseBox, moreMoreCheeseBox, moreBreadBox);
        toppings.setAlignment(Pos.TOP_LEFT);
        toppings.setSpacing(20);
        
        VBox colors = new VBox(colorTitle, blueButton, redButton, greenButton, yellowButton, purpleButton, orangeButton);
        colors.setAlignment(Pos.TOP_RIGHT);
        colors.setSpacing(20);
        
        setSpacing(20);
        getChildren().addAll(toppings, price, colors);
	}
	
	/**
	 * Adds 75 cents for each topping checkbox that is selected and displays updated cost.
	 * @param event that triggers the method
	 */
	public void processCheckBoxAction(ActionEvent event)
	{
		cost = 12;
		if (pepperoniBox.isSelected())
		{
			cost += 0.75;
		}
		if (sausageBox.isSelected())
		{
			cost += 0.75;
		}
		if (onionBox.isSelected())
		{
			cost += 0.75;
		}
		if (moreCheeseBox.isSelected())
		{
			cost += 0.75;

		}
		if (moreMoreCheeseBox.isSelected())
		{
			cost += 0.75;
		}
		
		if (moreBreadBox.isSelected())
		{
			cost += 0.75;
		}
		money.setText("Cost: $" + df.format(cost));
	}
	
	/**
	 * changes background depending on the radio button that is selected.
	 * @param event that triggers the method
	 */
	public void processRadioButtonAction(ActionEvent event)
	{
		if (blueButton.isSelected())
		{
			setStyle("-fx-background-color: blue");
		}
		
		if (redButton.isSelected())
		{
			setStyle("-fx-background-color: red");
		}
		
		if (greenButton.isSelected())
		{
			setStyle("-fx-background-color: green");
		}
		
		if (yellowButton.isSelected())
		{
			setStyle("-fx-background-color: yellow");
		}
		
		if (purpleButton.isSelected())
		{
			setStyle("-fx-background-color: purple");
		}
		
		if (orangeButton.isSelected())
		{
			setStyle("-fx-background-color: orange");
		}
	}
}
