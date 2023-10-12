import java.util.Scanner;

public class cube_of_number_with_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,result;

        System.out.print("Enter the number: ");
        num=sc.nextInt();

        result = num*num*num;
        System.out.println("Cube of " + " " + num + " = " + result);
    }
}
