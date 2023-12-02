
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class HWorld extends Application {
	 
	    @Override
	    public void start (Stage primaryStage) throws Exception{
	    	primaryStage.setTitle("MyWin");
	    	primaryStage.setHeight(300);
	    	primaryStage.setWidth(300);
	    	
	    	Pane root = new Pane();
	    	Button btn = new Button();
	    	btn.setText("Click me");
	    	btn.setTranslateX(100);
	    	btn.setTranslateY(100);
	    	
	    	btn.setPrefSize(80, 20);
	    	Rectangle rect = new Rectangle(50,50);
	    	
	    	
	    	btn.setOnAction(event ->{
	    		
	    		//char [] ch = new char [RED, BLUE];
	    		
	    		rect.setFill(Color.RED);
	    		//for (i=0, i<=4, i++){
	    		System.out.println("Hello!");
	    		System.out.println("Hello!");     		
	    	}
	    	);
	    		//btn.setOnAction(event ->{
	    		
	    		//rect.setFill(Color.BLUE);
	    	
	    	//	System.out.println("Hallo!");     		
	    	//});
	    	
	    	Scene scene = new Scene(root);
	    	root.getChildren().addAll(btn,rect);
	    	primaryStage.setScene(scene);
	    	primaryStage.show();
	    }
	
	    public static void main (String[] args){
	    	launch(args);
	}
}
	

