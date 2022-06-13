package Intellijcodes;
import java.util.Scanner;
public class tables {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);

        }

    }
}
