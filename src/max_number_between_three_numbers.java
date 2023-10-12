import java.util.Scanner;

public class max_number_between_three_numbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("a=");
        a=sc.nextInt();
        System.out.print("b=");
        b= sc.nextInt();
        System.out.print("c=");
        c= sc.nextInt();

        if(a>c && a>b){
            System.out.println("max number = " + a);
        }
        else if (b>a && b>c){
            System.out.println("max number = " + b);
        }
        else if (c>a && c>b){
            System.out.println("max number = " + c);
        }
        else {
            System.out.println(" all numbers are equal or two numbers are equal");
        }
    }
}
