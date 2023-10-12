import static java.lang.Math.pow;

public class cube_of_number {
    public static void main(String[] args) {
        long number = 10, result;
        result = number*number*number;
//        result = (long) pow(number,3);
        System.out.println("Cube of " + " " + number + " = " + result);
    }
}
