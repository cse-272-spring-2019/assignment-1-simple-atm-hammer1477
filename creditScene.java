
package atmm;
import static atmm.loginForm.Balance;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
public class creditScene extends Application {
    
    @Override
   public void start(Stage primaryStage) throws Exception{
       transactionsScene authentication2 = new transactionsScene();
     loginForm authentication1 = new loginForm();
       primaryStage.setTitle("<<Credit>>");
       Label Pin11=new Label("Enter the ammount of money you want to deposit in your account"); 
       TextField ammount=new TextField("");
       Label user=new Label();
       Button complete=new Button("<Complete transaction>");
       Button back=new Button("<<<Previous menu");
       GridPane grid=new GridPane();
       grid.add(Pin11,0,0);
       grid.add(complete,0,2);
       grid.add(ammount,0,1);
       grid.add(user,0,4);
       grid.add(back,0,3);
       Scene scene1 = new Scene(grid,500,350);
       primaryStage.setScene(scene1);
       primaryStage.show();
       complete.setOnAction(new EventHandler<ActionEvent>(){
       @Override
       public void handle(ActionEvent event){ 
       String ammountW=ammount.getText();
        Double ammountWD=Double.parseDouble(ammountW);
       double BalanceW=authentication1.Credit(ammountWD,Balance);        
       
             user.setText("Transaction succeful and your balance is "+BalanceW);
        Balance=BalanceW;
        }
});           
       back.setOnAction(new EventHandler<ActionEvent>(){
          @Override       
        public void handle(ActionEvent event){ 
            
              try {
                  authentication2.start(primaryStage);
              } catch (Exception ex) {
                  Logger.getLogger(withdrawScene.class.getName()).log(Level.SEVERE, null, ex);
              }
}
    });
    }
    }
    

