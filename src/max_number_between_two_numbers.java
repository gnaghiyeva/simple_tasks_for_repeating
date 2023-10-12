import java.util.Scanner;

public class max_number_between_two_numbers {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a=");
        a=sc.nextInt();
        System.out.print("b=");
        b= sc.nextInt();

        if(a>b){
            System.out.println("max number = " + a);
        }
        else if(a<b){
            System.out.println("max number = " + b);
        }
        else{
            System.out.println("Numbers are equal.");
        }
    }
}
