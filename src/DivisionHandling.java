import java.util.Scanner;

public class DivisionHandling {
        // TODO: Read two integers a and b
        // TODO: Enclose the division in a try block
        // TODO: Catch ArithmeticException
        Scanner sc = new Scanner(System.in);
        try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a / b);
        }catch (ArithmeticException e) {
                System.out.println("Divide by zero error");
        }
        sc.close();
        
}
