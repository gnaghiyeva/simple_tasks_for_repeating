import java.util.Scanner;

public class operatios_on_numbers {
    public static void main(String[] args) {
        int a,b;
        char operation;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: a =  ");
        a=sc.nextInt();

        System.out.print("Enter the second number: b = ");
        b=sc.nextInt();

        System.out.print("Enter the operation: operation = " );
        operation = sc.next().charAt(0);

        if(operation == '+'){
            System.out.println("sum = "+(a+b));
        }
       else if(operation == '-'){
            System.out.println("difference = "+(a-b));
        }
       else if(operation == '*'){
            System.out.println("product = "+(a*b));
        }
       else if(operation == '/') {
           if(b==0){
                System.out.println("there is no division to zero.");
            }
            else {
                System.out.println("result = " + (a/b));
            }
        }
       else {
            System.out.println("Your choice is incorrect");
        }
    }
}
