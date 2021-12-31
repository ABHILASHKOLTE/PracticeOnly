package practiceprograme;

import java.util.Scanner;

public class UserInputScanner {
    public static void main(String[] args) {
//        1.display message
        System.out.println("Print any Number");
//     "number" is variable
//         Scanner is class and for create class into object
//        we right as new  scanner (system.in)<-is output take by outside
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number 1");
//        int a is variable that we created and number is name of variable in scanner
        int a = number.nextInt();
        System.out.println("Enter number 2");
        int b = number.nextInt();
        int sum = a + b;
        System.out.println( "The addition of number:" +sum );
        int sub = a - b ;
        System.out.println("the subrection  of number" +sub);
        int d = sum - sub ;
        System.out.println("diffrence of number:" +d);

    }
}
