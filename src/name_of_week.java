import java.util.Scanner;

public class name_of_week {
    public static void main(String[] args) {
        int day;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of number: ");
        day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Bazar ertəsi");
                break;

            case 2:
                System.out.println("Çərşənbə axşamı");
                break;

            case 3:
                System.out.println("Çərşənbə");
                break;

            case 4:
                System.out.println("Cümə axşamı");
                break;
            case 5:
                System.out.println("Cümə");
                break;

            case 6:
                System.out.println("Şənbə");
                break;
            case 7:
                System.out.println("Bazar");
                break;

            default:
                System.out.println("Your choice is incorrect");


        }
    }
}
