package application;

import javafx.event.Event;
import javafx.event.EventHandler;

public class Control implements EventHandler<Event>
{
	
	GUI gui;
	
	public Control(GUI gui) 
	{
	    this.gui = gui;
	    
	}
	
	@Override
	public void handle(Event event) 
	{
		
	    Object cmd = event.getSource();
	    
	    if(gui.btn1.equals(cmd))
	    {
	    	
	        System.out.println("your pressed btn1");
	    }
	    
	}

}