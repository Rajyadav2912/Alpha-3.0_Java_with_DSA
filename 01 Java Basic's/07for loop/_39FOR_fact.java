import java.util.Scanner;

public class _39FOR_fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
       
        System.out.print("enter a num :");
        num = sc.nextInt();
        int fact= 1;
        for (int i = 1 ; i <= num ; i++){
           
            fact*=i;
         
          
          }  System.out.print(fact);
            sc.close();
        }
        } 
       
    
