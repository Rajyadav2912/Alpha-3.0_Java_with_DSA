import java.util.Scanner;

public class _22SW_weekname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int week;
        
        System.out.print("Enter a week no.(1-7) : ");
        week= sc.nextInt();

        switch(week){
           
            case 1 : 
                   System.out.println("Monday");
                   break;
            case 2 :
                   System.out.println("Tuesday");
                   break;
            case 3 :
                    System.out.println("Wednesday");
                    break;
            case 4 :
                    System.out.println("Thuresday");
                    break;
            case 5 :
                    System.out.println("Friday");
                     break;
            case 6 :
                    System.out.println("Saturday");
                     break;
            case 7 :
                    System.out.println("Sunday");
                    break;
            default : System.out.println("Invaild no. your print! Please Enter a week no.(1-7) ");
        }
        sc.close();
    }
}
