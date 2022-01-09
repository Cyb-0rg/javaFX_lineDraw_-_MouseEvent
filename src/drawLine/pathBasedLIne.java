package drawLine;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class pathBasedLIne extends Application{
	
    Label label= new Label("Wait mouse");
    
    Path path= new Path();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);

	}
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
        Group root = new Group();
  
        
        path.setStrokeWidth(1);
        path.setStroke(Color.BLACK);

        root.getChildren().add(label);
        root.getChildren().add(path);
        
        
        
        primaryStage.setTitle("java-buddy.blogspot.com");
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
		
        
        
        scene.setOnMouseClicked(e ->drawer(e));
        scene.setOnMouseDragged(e ->drawer(e));
        scene.setOnMouseEntered(e ->drawer(e));
        scene.setOnMouseExited(e ->drawer(e));
        scene.setOnMouseMoved(e ->drawer(e));
        scene.setOnMousePressed(e ->drawer(e));
        scene.setOnMouseReleased(e ->drawer(e));
		
	}
    
    public void drawer(MouseEvent mouseEvent){
    	
        label.setText(mouseEvent.getEventType() + "\n"
                + "X : Y - " + mouseEvent.getX() + " : " + mouseEvent.getY() + "\n"
                + "SceneX : SceneY - " + mouseEvent.getSceneX() + " : " + mouseEvent.getSceneY() + "\n"
                + "ScreenX : ScreenY - " + mouseEvent.getScreenX() + " : " + mouseEvent.getScreenY());
        
        
        
        
        if(mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED){
            //path.getElements().clear();
        	
            path.getElements().add(new MoveTo(mouseEvent.getX(), mouseEvent.getY())); //*** most importtant line
            
        }
        else if(mouseEvent.getEventType() == MouseEvent.MOUSE_DRAGGED){
            path.getElements().add(new LineTo(mouseEvent.getX(), mouseEvent.getY()));
        }
        
        
        
    	
    }
	
	
	

}
