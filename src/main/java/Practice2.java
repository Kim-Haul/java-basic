import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (90 < score && score <= 100) {
            System.out.println("A등급");
        } else if ( 80 < score && score <= 90) {
            System.out.println("B등급");
        } else if ( 70 < score && score <= 80) {
            System.out.println("C등급");
        } else {
            System.out.println("F등급");
        }
    }
}
