package toggleButtons;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class radioButtons extends Application{
	
	Label label2 = new Label("ANS.");
	Text text1 = new Text("");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);

	}

	@Override
	public void start(Stage st) throws Exception {
		// TODO Auto-generated method stub
		
		VBox vbox = new VBox ();
		vbox.setSpacing(8);
		//vbox.setAlignment(Pos.CENTER);
		
		VBox radiobox = new VBox ();
		//radiobox.setAlignment(Pos.CENTER);
		radiobox.setSpacing(3);
		
		Label label1 = new Label("10+5=?");
		
		RadioButton r1 = new RadioButton("12");
		RadioButton r2 = new RadioButton("13");
		RadioButton r3 = new RadioButton("14");
		RadioButton r4 = new RadioButton("15");
		
		ToggleGroup group1 = new ToggleGroup();
		r1.setToggleGroup(group1);
		r2.setToggleGroup(group1);
		r3.setToggleGroup(group1);
		r4.setToggleGroup(group1);
		
		r1.setOnAction(e -> lostAnswer());
		r2.setOnAction(e -> lostAnswer());
		r3.setOnAction(e -> lostAnswer());
		
		r4.setOnAction(e -> findAnswer());
		
		
		
		radiobox.getChildren().addAll(r1,r2,r3,r4);
		vbox.getChildren().addAll(label1,radiobox,label2, text1);
		
		
		Scene scene1 = new Scene(vbox, 300,200);
		st.setScene(scene1);
		st.setTitle(STYLESHEET_CASPIAN);
		st.show();
		
		
	}

	private void lostAnswer() {
		// TODO Auto-generated method stub
		
		label2.setText("wrong Answer");
		text1.setText("Try Again");
		
	}

	private void findAnswer() {
		// TODO Auto-generated method stub
		
		label2.setText("correct answer");
		text1.setText("next>>");
	}
	





}
