package ziva;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Second extends Application {
  private int index;
    @Override
    public void start(Stage stage)  {
        

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
        // vb.setStyle("-fx-background-color:orange");


      //SECOND SCREEN  
        Text text2= new Text();
        TextField tf2 = new TextField();
    
        Button btn2 = new Button("Square");

        btn2.setStyle("-fx-background-color:lightblue");

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                double num = Double.parseDouble(tf2.getText());

                text2.setText(""+(num*num));



            }
            
        });

        Button btn3 = new Button("Square Root");

        btn3.setStyle("-fx-background-color:blue");

        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                double num = Double.parseDouble(tf2.getText());

                text2.setText(""+Math.sqrt(num));

                

            }
            
        });

        VBox vb2 = new VBox(50,tf2 , btn2,btn3,text2);
        vb2.setPadding(new Insets(50,50,50,50));
        // vb2.setStyle("-fx-background-color:orange");


        
        

        //SCREEN 3


        TextField username = new TextField();
        PasswordField password = new PasswordField();
        username.setPromptText("enter username: -");
        password.setPromptText("enter password: -");

        Text welcomeTxt = new Text("");
        
        Button btn4 = new Button("Login");

        

        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                welcomeTxt.setText(username.getText()+"  You are welcome!!!!");
            }
        }); 

       VBox vb3 = new VBox(40,username,password,btn4,welcomeTxt);

        
VBox root = new VBox(50);

// SCENE 4

Text text3= new Text();
        TextField tf4 = new TextField();
    
        Button btn5 = new Button("Check");

        btn5.setStyle("-fx-background-color:lightblue");

        tf4.setPromptText("check palindrome");
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                
                
                String str = tf4.getText();


                StringBuffer sb = new StringBuffer(str);

                if(str.equals(sb.reverse().toString())){
                   text3.setText(str+" is  a palindrome!!!!"); 
                }else{
                text3.setText(str+" is not a palindrome!!!!");
                }
            }
            
        });

        VBox vb4 = new VBox(50,tf4 , btn5,text3);
        vb4.setPadding(new Insets(50,50,50,50));





        Button lbtn = new Button("Click Me!!");
        VBox vbLast = new VBox(lbtn);
        vbLast.setPadding(new Insets(49));
     
        vbLast.setMinHeight(100);
        vbLast.setMinWidth(index);
        lbtn.setStyle("-fx-background-color:lightblue");
        lbtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                String str[] = new String[]{"red","green","blue","violet","maroon"};

                        if(index>=str.length){
                            index = 0;
                        }
        // lbtn.setStyle("-fx-background-color:"+str[index]);
         vbLast.setStyle("-fx-background-color:"+str[index]);
        // lbtn.setStyle("-fx-background-color:red");
        index = index+1;



            }
        });
        







// TabPane tabPane = new TabPane();
// tabPane.getTabs().addAll(
//     new Tab("Print Text", vb),
//     new Tab("Square/Sqrt", vb2),
//     new Tab("Login", vb3),
//     new Tab("Palindrome", vb4),
//     new Tab("Color Changer", vbLast)
// );



// FlowPane root2 = new FlowPane(50, 50); // horizontal and vertical gap
// root2.getChildren().addAll(vb, vb2, vb3, vb4, vbLast);





        root.getChildren().addAll(vb,vb2,vb3,vb4,vbLast);
       
       root.setMaxWidth(Double.MAX_VALUE);  
    //    root.setMinWidth();
       root.setStyle("-fx-background-color:pink");

       root.setAlignment(Pos.CENTER);
        ScrollPane sp = new ScrollPane(root);
        Scene sc = new Scene(sp,800,700,Color.GREY);
        
        sp.setStyle("-fx-background-color:orange");
       
         stage.setHeight(800);
        stage.setWidth(700);
        stage.setScene(sc);

        stage.show();
       
        
    }

}

