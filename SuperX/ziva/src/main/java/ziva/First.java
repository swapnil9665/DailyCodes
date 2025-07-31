package ziva;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class First extends Application {
   
    @Override
    public void start(Stage stage)  {
        stage.show();

        Text text1= new Text();
        TextField tf1 = new TextField();
    
        Button btn = new Button("Print text");

        btn.setStyle("-fx-background-color:lightblue");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                text1.setText(tf1.getText());

            }
            
        });

        VBox vb = new VBox(50,tf1 , btn,text1);
        vb.setPadding(new Insets(50,50,50,50));
        vb.setStyle("-fx-background-color:orange");
        Scene sc = new Scene(vb,1000,700);
        

        stage.setScene(sc);
        
    }
}
