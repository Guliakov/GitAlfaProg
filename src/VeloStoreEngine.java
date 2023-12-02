import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javafx.*;

public class VeloStoreEngine {
	 
	VeloStore parent; // a reference to the Calculator
		
	 // Constructor stores the reference to the 
	 // Calculator window in  the member variable parent
	VeloStoreEngine(VeloStore parent){
	   this.parent = parent;
	 }
	
	public HBox addHBox() {
	    HBox hbox = new HBox();
	    hbox.setPadding(new Insets(15, 12, 15, 12));
	    hbox.setSpacing(10);
	    hbox.setStyle("-fx-background-color: #336699;");

	    Button buttonCurrent = new Button("Current");
	    buttonCurrent.setPrefSize(100, 20);

	    Button buttonProjected = new Button("Projected");
	    buttonProjected.setPrefSize(100, 20);
	    hbox.getChildren().addAll(buttonCurrent, buttonProjected);

	    return hbox;
	}
}
