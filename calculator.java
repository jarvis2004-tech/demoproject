
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner abhi =new Scanner(System.in);

        System.out.println("enter a no. a -");
        double a = abhi.nextDouble();
        System.out.println("enter a no. b - ");
        double b = abhi.nextDouble();
        System.out.println("choose an operation from below");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");

        System.out.println("enter your choice from above (1-5)");
        int choice = abhi.nextInt ();

        switch(choice){
            case 1: System.out.println("result -" + (a + b));
            break;
            case 2: System.out.println("result -"+ (a - b));
            break;
            case 3: System.out.println("result -" +(a*b));
            break ;
            case 4: 
            if (b != 0) {

                System.out.println("result -"+ (a/b) );
            } else {
                System.out.println("error, division by zero is not defined");
            }
              break;
              case 5: 
              if (b != 0){
                System.out.println("result -" + (a%b));
            } else {
                System.out.println("error");
            }
              break;
              default :
              System.out.println(" invalid choice");
        }







    }
}
