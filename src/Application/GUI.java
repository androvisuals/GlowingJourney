package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


public class GUI extends Application 
{

	Button btn1 = new Button("press me is it working?");
	
	
	@Override
	public void start(Stage primaryStage) 
	{
	    try 
	    {
	        BorderPane root = new BorderPane();
	        Scene scene = new Scene(root,400,400);
	
	        root.setCenter(btn1);
	        
	        primaryStage.setScene(scene);
	        primaryStage.show();
	
	
	    } 
	    catch(Exception e) 
	    {
	
	        e.printStackTrace();
	    }
	}
}