import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER FIRST NUMBER:");
        int a = sc.nextInt();

        System.out.println("ENTER SECOND NUMBER:");
        int b = sc.nextInt();

        System.out.println("SUM =" + (a + b));
        System.out.println("Difference =" + (a - b));
        System.out.println("Product =" + ( a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Remainder = " + (a % b));

        sc.close();
    }
}
