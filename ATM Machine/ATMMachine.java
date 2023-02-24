 /* ATM Machine  
    pin =1234;

 */ 
import java.util.*;
class ATM { 
    float Balance; 
    int Pin =1234; 
     
     public void checkPin() 
     { 
        System.out.println("Enter Your Pin:"); 
        Scanner sc= new Scanner(System.in); 
        int enterpin=sc.nextInt();
        if(enterpin==Pin){
            menu();
        } 
        else{ 
            System.out.println("Enter a valid Pin");
        }
     } 
     public void menu() 
     { 
        System.out.println("Enter Your Choice: ");
                         System.out.println("1. Check  A/C Balance"); 
                         System.out.println("2. Withdraw Money"); 
                         System.out.println("3. Deposite Money"); 
                         System.out.println("4. Exist"); 
          System.out.println("----------------------------------------");
        Scanner sc=new Scanner(System.in); 
        int opt=sc.nextInt();
        
          if(opt ==1){  
            checkBalance(); 
          }
        else if(opt==2){ 
            WithdrawMoney();
        } 
        else if(opt==3){ 
            depositeMoney();
        } 
        else if(opt==4){ 
              return;
        }  
        else{ 
            System.out.println("Enter a valid choice");
        }

      } 
    
    public void checkBalance(){ 
        System.out.println("Balance :"+Balance); 
        menu();
    } 
    public void WithdrawMoney() 
    { 
        System.out.println("Enter Amount of Withdraw "); 
        Scanner sc =new Scanner(System.in); 
        float amount =sc.nextFloat(); 
        if(amount>Balance){ 
            System.out.println("Insufficient Balance");
        } 
        else{ 
            Balance=Balance-amount; 
            System.out.println("Money withdraw Successful"); 
            System.out.println("----------------------------------------");
          } 
        menu();
     } 
        public void depositeMoney(){ 
          System.out.println("Enter the Amount: "); 
         Scanner sc =new Scanner(System.in); 
         float Amount =sc.nextFloat();   
          Balance=Balance+Amount;    
        System.out.println("----------------------------------------");
        System.out.println("Money deposited Successfull!!!!");  
        menu();
        }
    }


public class ATMMachine 
 { 
    public static void main(String args[]) 
    { 
       ATM obj = new ATM();
       obj.checkPin();
    }
}