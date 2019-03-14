package atmm;

import javafx.scene.control.Label;

public class loginForm {
 static double Balance;
 static String[] history =new String[100];
 static int i;
        public boolean validate(String password){
            String real = (String) password;
            real="651999";
            if(password.equals(real)){
                
       return true;
             }
            else
            {
                return false;
                }  
        }
        public double withdrawT(double amountW,double Balance){
            if(Balance<amountW){
            return -1;
        }else{
                Balance=Balance-amountW;
                history[i]=("The account has been debited by"+amountW);
            i++;
    return Balance;
}
        }
        public double Credit(double amountW,double Balance){
            Balance=Balance+amountW;
            history[i]=("The account has been credited by"+amountW);
                        System.out.println(history[i]);
            i++;
             return Balance;
        }
         
}
        

