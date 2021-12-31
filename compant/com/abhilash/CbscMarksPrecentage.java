package compant.com.abhilash;

import java.util.Scanner;

public class CbscMarksPrecentage {
    public static void main(String[] args) {
        System.out.println("Type your marks ");
        Scanner marks = new Scanner(System.in);
        System.out.println("english");
        float a = marks.nextInt();
        System.out.println("hindi");
       float b = marks.nextInt();
        System.out.println("marathi");
        float c = marks.nextInt();
        System.out.println("geography");
        float d = marks.nextInt();
        System.out.println("science");
        float e = marks.nextInt();
        float totalMarks = a + b+ c + d + e ;
        System.out.println("Total-marks:" +totalMarks);
//        float p = 500;
        float totalMarkObtain = (totalMarks / 500 *100 ) ;
        System.out.println("Percentage: " +totalMarkObtain);

    }
}
