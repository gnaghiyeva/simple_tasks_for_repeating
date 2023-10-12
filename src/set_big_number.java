import java.util.Scanner;

public class set_big_number {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ədəd daxil edin:");

        n=sc.nextInt();

        if(n>=0 && n<10){
            System.out.println("Ədəd birəqəmlidir.");
        }
        else if(n>=10 && n<100){
            System.out.println("Ədəd ikirəqəmlidir.");
        }
        else if(n>=100 && n<1000){
            System.out.println("Ədəd üçrəqəmlidir.");
        }
        else{
            System.out.println(" ");
        }
    }
}
