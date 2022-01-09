package drawLine;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class simple_lineDraw extends Application{

	Path path = new Path ();
	Text label = new Text();
	
	Button clearButton = new Button("clear");

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		Pane pane = new Pane();
		
		path.setStroke(Color.LIMEGREEN);
		path.setStrokeWidth(4);
		
		clearButton.setLayoutX(285);
		clearButton.setLayoutY(560);
		clearButton.setOnAction(e -> cleaner());
		pane.getChildren().addAll(path, label, clearButton);
		
		
		
		Scene scene = new Scene (pane, 600, 600);
		stage.setScene(scene);
		stage.setTitle(STYLESHEET_CASPIAN);
		stage.show();
		
		
		scene.setOnMouseDragged(e ->drawer(e));
        scene.setOnMousePressed(e ->drawer(e));
		
	}
	

    private void cleaner() {
		// TODO Auto-generated method stub
	
    	path.getElements().clear();
	}

	public void drawer(MouseEvent e){
    
        
        if(e.getEventType() == MouseEvent.MOUSE_PRESSED){
        	
            path.getElements().add(new MoveTo(e.getX(), e.getY())); //*** most important line
            
        }
        
        else if(e.getEventType() == MouseEvent.MOUSE_DRAGGED){
        	
            path.getElements().add(new LineTo(e.getX(), e.getY())); //*** most important line
            
        }
 
        
        
    	
    }
	
	

}
