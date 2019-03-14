package atmm;
import static atmm.loginForm.Balance;
import static atmm.loginForm.history;
import static atmm.loginForm.i;
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

public class transactionsScene {
   
    
       
   public void start(Stage primaryStage) throws Exception{
       withdrawScene authentication2 = new withdrawScene();
       creditScene authentication = new creditScene();
       loginForm authentication1 = new loginForm();
       primaryStage.setTitle("ATM");
       Label Pin1=new Label("Choose one of the transactions below"); 
       Button withdraw=new Button("Withdraw");
       Button Credit=new Button("Credit");
       Button previousTransaction=new Button("<<<Previous transaction");
       Button nextTransaction=new Button("Next transaction>>>");
       Button balanceInquiry=new Button("Balance inquiry");
       Label show =new Label();
       GridPane grid=new GridPane();
       grid.add(Pin1,0,0);
       grid.add(withdraw,0,1);
       grid.add(Credit,0,2);
       grid.add(balanceInquiry,0,3);
       grid.add(previousTransaction,0,4);
       grid.add(nextTransaction,0,5);
       grid.add(show,0,6);
       Scene scene1 = new Scene(grid,500,350);
       primaryStage.setScene(scene1);
       primaryStage.show();
       withdraw.setOnAction(new EventHandler<ActionEvent>(){
       @Override
       public void handle(ActionEvent event){
               try {
                   authentication2.start(primaryStage);
               } catch (Exception ex) {
                   Logger.getLogger(transactionsScene.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           
       });
       balanceInquiry.setOnAction(new EventHandler<ActionEvent>(){
       @Override
       public void handle(ActionEvent event){
           show.setText("<<Your balance is>>"+Balance);
               }
           
           
       });
       
       Credit.setOnAction(new EventHandler<ActionEvent>(){
       @Override
       public void handle(ActionEvent event){
               try {
                   authentication.start(primaryStage);
               } catch (Exception ex) {
                   Logger.getLogger(transactionsScene.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           
       });
       previousTransaction.setOnAction(new EventHandler<ActionEvent>(){
       @Override
       public void handle(ActionEvent event){
       
       if(i==0){
           show.setText("No previous transactions");
           i--;
       }else
       {
           show.setText(history[i-1]);
       i--;
       }
       }
           
       });
       nextTransaction.setOnAction(new EventHandler<ActionEvent>(){
       @Override
       public void handle(ActionEvent event){
           if(history[i+1]!=null){
           show.setText(history[i+1]);
       i++;
           }else{
               show.setText("No more transactions");
           i++;
           
           }
           
           }
       });
         }}





